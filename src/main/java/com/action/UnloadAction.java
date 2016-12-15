package com.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;

/**
 * Created by admin on 2016/12/14.
 */
public class UnloadAction extends ActionSupport{
    private File upload;//文件
    private String uploadContentType;//文件类型
    private String uploadFileName;//文件名
    private String result;//返回结果

    @Override
    public String execute() throws Exception {
        String filePath = ServletActionContext.getServletContext().getRealPath("/downloadFile");
        File file = new File(filePath);
        if(!file.exists()){
            file.mkdirs();
        }
        FileUtils.copyFile(upload,new File(file,uploadFileName));
        result = "上传成功!";
        return SUCCESS;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
