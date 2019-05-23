package com.yuan.ngu.springbootfileupload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@CrossOrigin
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/upload")
    public Object upload(@RequestParam(value = "file") MultipartFile[] files, HttpServletRequest request) {
        return "{\"returnMessage\":\"\",\"returnCode\":\"0000\",\"imgUrl\":\"" + "http://pic32.nipic.com/20130823/13339320_183302468194_2.jpg" + "\",\"bigImgUrl\":\"" + "http://pic32.nipic.com/20130823/13339320_183302468194_2.jpg" + "\"}";
    }
}
