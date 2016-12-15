package com.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.util.List;

/**
 * Created by admin on 2016/12/14.
 */
//批量上传
public class BatchUnloadAction extends ActionSupport{
    private List<File> upload;
    private List<String> uploadContentType;
    private List<String> uploadFileName;
    private String result;

    @Override
    public String execute() throws Exception {
        String filePath = ServletActionContext.getServletContext().getRealPath("/downloadFile");
        File file = new File(filePath);
        if(!file.exists()){
            file.mkdirs();
        }
        for(int i=0;i<upload.size();i++){
            FileUtils.copyFile(upload.get(i),new File(file,uploadFileName.get(i)));
        }
        result = "上传成功";
        return SUCCESS;
    }

    public List<File> getUpload() {
        return upload;
    }

    public void setUpload(List<File> upload) {
        this.upload = upload;
    }

    public List<String> getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(List<String> uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public List<String> getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(List<String> uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
