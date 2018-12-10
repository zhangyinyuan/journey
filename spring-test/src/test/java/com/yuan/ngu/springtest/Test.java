package com.yuan.ngu.springtest;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Test {
    public static void main(String[] args) {
        String str = "{\"PAYMENT\":[{\"BACK_URL\":\"\",\"BANK_CARD_ID\":\"\",\"USR_ONLYID\":\"4985571\"}]}";

        JSONObject jsonObject = JSON.parseObject(str);
        JSONArray payment = jsonObject.getJSONArray("PAYMENT");
        for (Object o : payment) {
            JSONObject jsonObject1 = (JSONObject) o;
            System.out.println(jsonObject1);
        }
    }
}
