package com.yuan.ngu.boot.oss.callback.controller;

import com.aliyun.oss.OSSClient;
import com.yuan.ngu.boot.oss.callback.conf.OSSConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

@Controller
@RequestMapping("/sdkUpload")
public class SDKUploadCotnroller {

    @RequestMapping("/upload")
    public void upload(){
        OSSClient ossClient = new OSSClient(OSSConfig.endpoint, OSSConfig.accessId, OSSConfig.accessKey);
        InputStream is = new ByteArrayInputStream("Hello OSS".getBytes());
        String firstKey = "test-sdk-upload";
        ossClient.putObject(OSSConfig.bucketName, firstKey, is);
        System.out.println("Object：" + firstKey + "存入OSS成功。");
    }
}
