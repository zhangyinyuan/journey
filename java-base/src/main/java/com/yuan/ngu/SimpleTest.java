package com.yuan.ngu;

import org.junit.Test;

public class SimpleTest {

    private String a = "1";

    @Test
    public void test() {
//        int a = 1;
//        testA(a);
//        System.out.println(a);
        String aaa = new String("abc");
        String bbb = new String("abc");
        System.out.println(aaa == bbb);
    }

    void testA(int a) {
        a = a + 1;
    }

    public static void main(String[] args) {
        String a = new SimpleTest().a;
        System.out.println(a);
    }

    interface ITest {
        int a = 1;
    }
}
