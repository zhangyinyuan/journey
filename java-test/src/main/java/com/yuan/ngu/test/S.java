package com.yuan.ngu.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class S implements I {

    public S() {
    }

//    @Override
//    public void test() {
//        super.test();
//        System.out.println("son test");
//    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(new Date());
        System.out.println(format);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(sdf.parse(format).getTime() - 86400000));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(sdf.parse(format).getTime() - 1));
    }
}
