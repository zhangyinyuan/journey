package com.yuan.ngu.test;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 30000; i++) {
            System.out.println((int) (30 + Math.random() * 2));
        }
    }
}