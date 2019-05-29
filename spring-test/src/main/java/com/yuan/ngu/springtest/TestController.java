package com.yuan.ngu.springtest;

import com.alibaba.fastjson.JSON;
import com.sun.deploy.net.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


@RestController
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(path = "/test")
    public Object test() {
        if (serverPort != null) {
            throw new RuntimeException("测试异常");
        }
        return serverPort;
    }

    @RequestMapping(path = "/testVideo")
    public Object testVideo(String videoUrl) {

//        try {
//            ResponseEntity get = new HttpConnectUtil().tempHttp(null, videoUrl, null, "get");
//            System.out.println("------->" + get.getHeaders().get("Content-Type").get(0).contains("video/"));
//            return  get;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//        }

        URL url;
        try {
            url = new URL("http://material.file.wangyangming.org.cn/lluKiX-4BxvrPIfWdK_LzgAdADul");
            InputStream in = url.openStream();
            System.out.println("连接可用");
        } catch (Exception e1) {
            System.out.println("连接打不开!");
            url = null;
        }
        return serverPort;
    }


    public class HttpConnectUtil {

        /**
         * @param requestParam  请求时带的实体类，参数等
         * @param url           HTTP 请求地址
         * @param header        请求头，没有请求头的设置为null即可
         * @param requestMethod 请求方法 GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE;
         * @return 返回的是Object类型 其中ResponseEntity.getBody()请求返回json内容；ResponseEntity.getStatusCodeValue() 请求返回http状态码
         */
        public  <T> ResponseEntity tempHttp(T requestParam, String url, String header, String requestMethod) {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders requestHeaders = new HttpHeaders();
            requestHeaders.add("Authorization", header);
            HttpEntity<T> requestEntity = new HttpEntity<>(requestParam, requestHeaders);
            ResponseEntity response;
            HttpMethod httpMethod;
            String method = requestMethod.toLowerCase();
            switch (method) {
                case "post":
                    httpMethod = HttpMethod.POST;
                    break;
                case "put":
                    httpMethod = HttpMethod.PUT;
                    break;
                case "delete":
                    httpMethod = HttpMethod.DELETE;
                    break;
                case "patch":
                    httpMethod = HttpMethod.PATCH;
                    break;
                case "head":
                    httpMethod = HttpMethod.HEAD;
                    break;
                case "options":
                    httpMethod = HttpMethod.OPTIONS;
                    break;
                case "trace":
                    httpMethod = HttpMethod.TRACE;
                    break;
                default:
                    httpMethod = HttpMethod.GET;
            }
            response = restTemplate.exchange(url, httpMethod, requestEntity, String.class);
            return response;
        }
    }


}
