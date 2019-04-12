package com.yuan.ngu.test.jdk18;

import com.alibaba.fastjson.JSON;

public class BaseTest {
    public static void main(String[] args) {
//        String json = "{\"esc_orderid\":\"123456\",\"remark\":\"789\"}";
//        JsonPo jsonPo = JSON.parseObject(json, JsonPo.class);
//        System.out.println(jsonPo);

        String str = JSON.toJSONString("3");
        System.out.println(str);
    }
}
