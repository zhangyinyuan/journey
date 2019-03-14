package com.yuan.ngu.test.jdk18;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        //获取stream
        String[] arr = new String[]{"ab", "cd", "ef"};
        Stream<String> arrStream = Arrays.stream(arr);
        List<String> list = Arrays.asList("ab", "cd", "ef");
        Stream<String> listStream = list.stream();
        Stream<String> stringStream = Stream.of("ab", "cd", "ef");

        //stream 方法使用
        List<User> userList = Arrays.asList(
                new User("王五", 20),
                new User("王五", 91),
                new User("张三", 8),
                new User("李四", 44),
                new User("李四", 44)
        );
        System.out.println("========================= lamda");
        userList.forEach(user -> System.out.println(user));
        System.out.println("========================= stream");
        userList.stream().forEach(user -> System.out.println(user));

        //排序
        System.out.println("========================= stream sorted");
        userList.stream().sorted(Comparator.comparing(User::getAge)).forEach(user -> System.out.println(user));

        //过滤
        System.out.println("========================= stream filter");
        userList.stream().filter(user -> user.getAge() > 40).forEach(user -> System.out.println(user));

        //截取
        System.out.println("========================= stream limit 从0开始,只取前N个");
        userList.stream().limit(3).forEach(user -> System.out.println(user));

        //跳过
        System.out.println("========================= stream skip 与 limit互斥,");
        userList.stream().skip(3).forEach(user -> System.out.println(user));

        //去重    必须重写对应泛型的hashCode()和equals()方法
        System.out.println("========================= distance");
        userList.stream().distinct().forEach(user -> System.out.println(user));

        //测试计算
        IntSummaryStatistics num = userList.stream().mapToInt(user -> user.getAge()).summaryStatistics();
        System.out.println("总共人数:" + num.getCount());
        System.out.println("平均年龄:" + num.getAverage());
        System.out.println("最大年龄:" + num.getMax());
        System.out.println("最小年龄:" + num.getMin());
        System.out.println("年龄之和:" + num.getSum());


        List<Integer> collect = userList.stream().map(user -> user.getAge()).collect(Collectors.toList());
        collect.forEach(user -> System.out.println(user));

        List<String> collect1 = userList.stream().map(user -> user.getAge() + "岁").collect(Collectors.toList());
        collect1.forEach(user -> System.out.println(user));
    }


    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
