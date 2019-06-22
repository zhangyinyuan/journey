package com.yuan.ngu.jdk18;

import java.util.Comparator;

public class JDK18 {


    public interface IInterface {
        default void test1() {
            System.out.println(111);
        }

        default void test2() {
            System.out.println(222);
        }

        //接口中含有方法体的修饰符有两个:1.default(jdk1.8) 2.static(未验证)
        static void test3() {
            System.out.println(333);
        }
    }

    public static class CalssTest implements IInterface {
        @Override
        public void test1() {
            System.out.println("112233");
        }
    }


    public interface ILamda {
        void test(Integer x, String y);
    }

    public static void main(String[] args) {
//        new Thread(() -> {
//            System.out.println(123);
//            System.out.println(789);
//        }).start();
//
//        JDK18.testDefaultI(() -> System.out.println(234));
//        CalssTest calssTest = new CalssTest();
//        calssTest.test1();
//        calssTest.test2();
//        IInterface.test3();

        Comparator<Integer> cpt1 = (x, y) -> Integer.compare(x, y);
        Comparator<Integer> cpt3 = Integer::compare;
        System.out.println(cpt3.compare(1, 12121));
    }


    public static void testDefaultI(Runnable runnable) {
        System.out.println("1111111111111");
        runnable.run();
    }

    public static void testLamda(ILamda lamda) {
//        lamda.test(x, y);
    }

}
