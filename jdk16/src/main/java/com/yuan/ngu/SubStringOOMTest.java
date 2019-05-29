package com.yuan.ngu;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class SubStringOOMTest {
    @Test
    public void test() throws NoSuchFieldException, IllegalAccessException {
        List list = new ArrayList<Object>();
        for (int i = 0; i < 100; i++) {
            list.add(new HugeStr().getSub());
//            list.add(new ImprovedHugeStr().getSub());
            System.gc();
        }
        Object o = list.get(99);
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        Object o1 = value.get(o);
        if (o1 instanceof char[]) {
            System.out.println(((char[]) o1).length);
        }
    }

    public static class HugeStr{
        private String str = new String(new char[1024*1024]);
        public String getSub(){
            //substring并没有去new 一个String对象，substring返回的字符串和之前的字符串是共用的一个字符数组。
            //1.7已经修复, 内部采用Arrays.copyOfRange
            return str.substring(1, 5);
        }
    }
    public static class ImprovedHugeStr{
        private String str = new String(new char[1024*1024]);
        public String getSub(){
            return new String(str.substring(1, 5));//new String的时候会使用Arrays.copyOfRange 拷贝需要的部分。
        }
    }
}
