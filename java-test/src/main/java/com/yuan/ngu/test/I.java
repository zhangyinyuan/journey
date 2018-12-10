package com.yuan.ngu.test;

public interface I {
    default void test() {
        System.out.println("super test");
    }
}
