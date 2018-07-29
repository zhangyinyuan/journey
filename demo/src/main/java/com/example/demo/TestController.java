package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * DESCRIPTION
 *
 * @author zhangyinyuan
 * @create 2018-07-20 19:44
 **/
@RestController
public class TestController {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    public Object test(String text) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("res", "Hello" + text);
        return stringObjectHashMap;
    }

    public static void main(String[] args) {
        int a[] = {4, 10, 5, 3, 9, 2, 0};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                int temp = a[i];
//                if (a[i] > a[j]) {//从小到大
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                int temp = a[j];
                if (a[j] > a[j + 1]) {//从小到大
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int inta : a) {
            System.out.print(inta + " ");
        }
    }
}
