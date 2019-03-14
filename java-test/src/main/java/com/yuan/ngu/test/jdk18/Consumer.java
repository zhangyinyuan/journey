package com.yuan.ngu.test.jdk18;

@FunctionalInterface
public interface Consumer<T> {
//    changeStr("hello", (x) -> System.out.println(x));
//    void changeStr(String str);

    String changeStr();

}
