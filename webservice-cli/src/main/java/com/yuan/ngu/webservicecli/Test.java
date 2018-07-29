package com.yuan.ngu.webservicecli;

import com.yuan.ngu.webservice.WebServiceImpl;
import com.yuan.ngu.webservice.WebServiceImplService;

/**
 * DESCRIPTION
 *
 * @author zhangyinyuan
 * @create 2018-07-20 18:20
 **/
public class Test {
    public static void main(String[] args) {
        WebServiceImplService factory = new WebServiceImplService();
        WebServiceImpl webServiceImplPort = factory.getWebServiceImplPort();
        webServiceImplPort.say("就问你行不行");
    }
}
