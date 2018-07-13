package com.yuan.ngu.webservice;

import javax.xml.ws.Endpoint;

/**
 * DESCRIPTION
 *
 * @author zhangyinyuan
 * @create 2018-07-09 22:19
 **/
public class WebServicePublic {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost/hello", new WebServiceImpl());
        System.out.println("服务启动成功");
    }
}
