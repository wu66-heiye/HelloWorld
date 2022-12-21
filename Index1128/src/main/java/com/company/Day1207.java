package com.company;

import cn.hutool.core.date.*;

import java.util.Date;

public class Day1207 {
    public static void main(String[] args) {
        test5();
    }

    public static void test5(){
        DateTime birthday = DateUtil.parse("2000-01-01");
        DateTime compareDay = DateUtil.parse("2019-01-09");
        String today = DateUtil.today();
        DateTime tomorrow = DateUtil.tomorrow();
        DateTime lastWeek = DateUtil.lastWeek();
        DateTime lastMonth = DateUtil.lastMonth();
        DateTime nextMonth = DateUtil.nextMonth();
        DateTime nextWeek = DateUtil.nextWeek();
        int age = DateUtil.age(birthday, compareDay);
        //年龄
        int ageOfNow = DateUtil.ageOfNow("2000-12-8");
        System.out.println(ageOfNow);
        System.out.println("小明今年"+age+"岁啦！");
        System.out.println(today);
        System.out.println(tomorrow);
        System.out.println(lastWeek);
        System.out.println(lastMonth);
        System.out.println(nextWeek);
        System.out.println(nextMonth);
        System.out.println();
    }

    public static void test1() {
        String dateStr = "2017-03-1";
        Date date = DateUtil.parse(dateStr);

        //结果 2017/03/01
        String format = DateUtil.format(date, "yyyy/MM/dd");

        //常用格式的格式化，结果：2017-03-01
        String formatDate = DateUtil.formatDate(date);
        System.out.println(formatDate);

        //结果：2017-03-01 00:00:00
        String formatDateTime = DateUtil.formatDateTime(date);

        //结果：00:00:00
        String formatTime = DateUtil.formatTime(date);

        System.out.println(formatDateTime);
        System.out.println(formatTime);
    }

    public static void test2() {
        String dateStr = "2017-03-1";
        Date date = DateUtil.parse(dateStr);
        //获得年的部分
        int year = DateUtil.year(date);
        //获得月份，从0开始计数
        int month = DateUtil.month(date);
        //获得月份枚举
        Month dayNum = DateUtil.monthEnum(date);
        int dayOfMonth = DateUtil.dayOfMonth(date);
        System.out.println(year);
        System.out.println(month);
        System.out.println(dayNum);
        System.out.println(dayOfMonth);
    }

    public static void test3() {
        String dateStr = "2017-03-01 22:33:23";
        Date date = DateUtil.parse(dateStr);

        //一天的开始，结果：2017-03-01 00:00:00
        Date beginOfDay = DateUtil.beginOfDay(date);
        System.out.println(beginOfDay);
        //一天的结束，结果：2017-03-01 23:59:59
        Date endOfDay = DateUtil.endOfDay(date);
        System.out.println(endOfDay);
    }

    public static void test4() {
        String dateStr = "2017-03-01 22:33:23";
        Date date = DateUtil.parse(dateStr);

        //结果：2017-03-03 22:33:23
        Date newDate = DateUtil.offset(date, DateField.DAY_OF_MONTH, 2);
        System.out.println(newDate);
        //常用偏移，结果：2017-03-04 22:33:23
        DateTime newDate2 = DateUtil.offsetDay(date, -3);
        System.out.println(newDate2);
        //常用偏移，结果：2017-03-01 19:33:23
        DateTime newDate3 = DateUtil.offsetHour(date, -3);
        System.out.println(newDate3);
    }

}
