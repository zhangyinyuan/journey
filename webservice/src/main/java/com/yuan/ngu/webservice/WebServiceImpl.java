package com.yuan.ngu.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * DESCRIPTION
 *
 * @author zhangyinyuan
 * @create 2018-07-09 22:18
 **/
@WebService
public class WebServiceImpl implements IWebService {

    @WebMethod
    @Override
    public void say(String text) {
        System.out.println("Hello " + text);
    }
}
