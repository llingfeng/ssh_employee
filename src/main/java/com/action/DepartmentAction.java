package com.action;

import com.entity.Department;
import com.entity.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.DepartmentService;
import org.apache.struts2.ServletActionContext;

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

    public String delete(){
        department = departmentService.getDepartmentById(department.getDepartmentId());
        departmentService.deleteDepartment(department);
        return "successDel";
    }
}
