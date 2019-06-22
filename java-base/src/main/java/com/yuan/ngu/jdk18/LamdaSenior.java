package com.yuan.ngu.jdk18;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LamdaSenior {

    public static class Product implements Serializable {
        private static final long serialVersionUID = -2961771913836316831L;
        private String name;
        private String color;
        private BigDecimal price;

        public Product(String name, String color, BigDecimal price) {
            this.name = name;
            this.color = color;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    '}';
        }
    }


    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("苹果", "红色", new BigDecimal("100.13")));
        list.add(new Product("香蕉", "黄色", new BigDecimal(200)));
//        filterProduct(list, (p) -> p.getColor() == "红色");
//        filterProduct(list, (p) -> p.getPrice().compareTo(new BigDecimal("100")) < 0);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        list.stream().filter((p) -> p.getPrice().compareTo(new BigDecimal("100")) < 0);
//        list.stream().filter(p -> p.getColor() == "黄色").forEach(System.out::println);

//        changeStr("hello", (x) -> System.out.println(x));
    }


    static void filterProduct(List<Product> list, ILamdaSenior<Product> lamdaSenior) {
        for (int i = 0; i < list.size(); i++) {
            Product p = list.get(i);
            if (!lamdaSenior.filter(p)) {
                list.remove(i);
            }
        }
    }

    public interface ILamdaSenior<T> {
        boolean filter(T t);
    }

    public static void changeStr(String str, Consumer<String> con) {
    }
}
