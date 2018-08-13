package com.yuan.ngu.crossorigin;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
@RequestMapping(path = "/test")
public class TestCrossOriginController {

    @RequestMapping(path = "/testNotCrossOrigin")
    public Object testNotCrossOrigin() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0000");
        return jsonObject;
    }

    @CrossOrigin
    @RequestMapping(path = "/testSpringCrossOrigin")
    public Object testSpringCrossOrigin() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0000");
        return jsonObject;
    }

    @RequestMapping(path = "/testHttpCrossOrigin", method = RequestMethod.GET)
    public void testHttpCrossOrigin(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "0");
        response.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("XDomainRequestAllowed", "1");

        String callback = request.getParameter("callback");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "0000");
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.print(callback + "(" + jsonObject.toJSONString() + ")");
        System.out.println(callback + "(" + jsonObject.toJSONString() + ")");
    }
}
