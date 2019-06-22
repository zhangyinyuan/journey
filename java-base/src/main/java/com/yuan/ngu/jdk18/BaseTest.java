package com.yuan.ngu.jdk18;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
public class BaseTest {
    public static void main(String[] args) {
//        String json = "{\"esc_orderid\":\"123456\",\"remark\":\"789\"}";
//        JsonPo jsonPo = JSON.parseObject(json, JsonPo.class);
//        System.out.println(jsonPo);

        String str = JSON.toJSONString("3");
        System.out.println(str);
    }

    @Test
    public void testFinally(){
        Object obj = null;
        System.out.println(finallyReturn(obj));
        return;
    }

    private Object finallyReturn(Object obj) {
        try {
           return obj.equals("");
        } catch (NullPointerException e) {
            throw e;
        } finally {
            return null;
        }
    }


    @Test
    public void test(){
        Integer x  = 5;
        int y = 5;
        System.out.println(x == y);
    }
}
