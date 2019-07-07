package com.yuan.ngu;

import java.util.ArrayList;
import java.util.List;

public class CommonTest {
    public static void main(String[] args) {

        TestObj testObj ;
        List<TestObj> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            testObj = new TestObj();
            testObj.a = i;
            list.add(testObj);
        }

        list.forEach(obj -> System.out.println(obj.a));
    }

    static class TestObj{
        public Integer a ;
    }
}
