package com.action;

import com.entity.Department;
import com.entity.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.DepartmentService;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.*;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2016/12/1.
 */
public class DepartmentAction extends ActionSupport implements ModelDriven<Department>{
    private Department department = new Department();
    private DepartmentService departmentService;
    private Integer currentPage;
    @Override
    public Department getModel() {
        return department;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    //根据名字自动注入
    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    /**
     * 分页查询
     * @return
     */
    public String findAll(){
        PageBean<Department> pageBean = departmentService.findByPage(currentPage);
        ActionContext.getContext().getValueStack().push(pageBean);
        return "list";
    }

    /**
     * 跳转到新增页面
     * @return
     */
    public String saveUI(){
        return "saveUI";
    }

    /**
     * 保存部门
     * @return
     */
    public String save(){
        departmentService.save(department);
        return "saveSuccess";
    }

    /**
     * 跳转到修改页面
     * @return
     */
    public String edit(){
        department = departmentService.getDepartmentById(department.getDepartmentId());
        return "editUI";
    }

    /**
     * 跳转到更新页面
     * @return
     */
    public String update(){
        departmentService.updateDepartment(department);
        return "updateSuccess";
    }

    /**
     * 下载
     * @return
     */
    public String delete(){
        department = departmentService.getDepartmentById(department.getDepartmentId());
        departmentService.deleteDepartment(department);
        return "successDel";
    }

    /**
     * 下载文件
     * @return
     */
    public String download(){
        return "download";
    }

    public InputStream getInputStream(){
        List<Department> departmentList = departmentService.getDepartmentList();
        String path = "e://tempFile";
        File filePath = new File(path);
        if(!filePath.exists()){
            filePath.mkdir();
        }
        File file = new File(filePath,System.currentTimeMillis()+".xls");
        FileInputStream fileOutputStream = null;
        try {
            file.createNewFile();
            //创建工作簿
            WritableWorkbook workbook = Workbook.createWorkbook(file);
            //创建sheet
            WritableSheet sheet = workbook.createSheet("sheet1", 0);
            Label label = null;
            String[] title = {"部门id","部门名称","部门描述"};
            //设置标题
            for(int i=0;i<3;i++){
                label = new Label(i,0,title[i]);
                sheet.addCell(label);
            }
            //追加内容
            for(int i=1;i<departmentList.size();i++){
                Department department = departmentList.get(i);
                label = new Label(0,i,String.valueOf(department.getDepartmentId()));
                sheet.addCell(label);
                label = new Label(1,i,String.valueOf(department.getDepartmentName()));
                sheet.addCell(label);
                label = new Label(2,i,String.valueOf(department.getDepartmentDesc()));
                sheet.addCell(label);
            }
            workbook.write();
            workbook.close();
            fileOutputStream = FileUtils.openInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RowsExceededException e) {
            e.printStackTrace();
        } catch (WriteException e) {
            e.printStackTrace();
        }
        return fileOutputStream;
    }

    public String getDownloadFileName(){
        String fileName = "";
        try {
            fileName = URLEncoder.encode("部门"+System.currentTimeMillis()+".xls","utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return fileName;
    }
}
