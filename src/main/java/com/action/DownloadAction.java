package com.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by admin on 2016/12/15.
 */
public class DownloadAction extends ActionSupport {
    private String inputPath;
    private String fileName;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    //获取输入流
    public InputStream getInputStream() throws IOException {
//        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
        String path = ServletActionContext.getServletContext().getRealPath("/downloadFile");
        String filePath = path+"\\"+fileName;
        File file = new File(filePath);
        return FileUtils.openInputStream(file);
    }

    //获取文件名称
    public String getDownloadFileName() throws UnsupportedEncodingException {
        String downloadFileName = "";
        downloadFileName = URLEncoder.encode("文件下载.jpg","utf-8");
        return downloadFileName;
    }

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
