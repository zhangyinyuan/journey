package com.yuan.ngu.test;


public class Test {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("1");
//        list.add("2");
//        for (int i = 0; i < list.size(); i++) {
//            if (list.size() >= 2 && i == (list.size() - 2)) {
//                //如果当前下标为倒数第二个
//                System.out.println(list.get(i + 1));
//                break;
//            }
//        }
//        System.out.println(1);
        String origin = "<![CDATA[http://xz.bwfapiao.com/500102000000183/152000186357/152000186357_68967079.pdf?Expires=1858736035&OSSAccessKeyId=LTAIB3SkRb2V8Vu1&Signature=8Qp7QkUwUGDdAlV8bXgG8xxxPRs%3D]]>";
        System.out.println(origin.replaceAll("<!\\[CDATA\\[","").replaceAll("]]>",""));
        System.out.println(origin.replace("<!\\[CDATA\\[","").replace("]]>",""));

        System.out.println(Math.abs(-10.11212));
    }
}
