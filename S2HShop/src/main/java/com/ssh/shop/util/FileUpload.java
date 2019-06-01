package com.ssh.shop.util;

import com.ssh.shop.entity.FileImage;

public interface FileUpload {

    //实现文件上传的功能，返回上传后新的文件名称
    public abstract String uploadFile(FileImage fileImage);
}
