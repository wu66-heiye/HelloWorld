package com.company;

import cn.hutool.core.convert.Convert;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        test5();
    }

    public static void test5(){
        double a = 3631.70;
        //结果为：壹 亿 贰 仟 叁 佰 肆 拾 伍 万 陆 仟 柒 佰 捌 拾 玖 元 叁 角 贰 分
        String digitUppercase = Convert.digitToChinese(a);
        char dig [] = digitUppercase.toCharArray();
        for (char c:dig) {
            System.out.print(c+" ");
        }
    }

    public static void test4() {
        String startTime = "2022-11-01";
        String endTime = "2022-11-02";
        DateTimeFormatter matter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter matters = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime startDate = LocalDateTime.parse(startTime+" 00:00:00",matter);
        LocalDateTime endDate = LocalDateTime.parse(startTime+" 23:59:59",matter);

        LocalDateTime endDates = LocalDateTime.parse(endTime+" 23:59:59",matter);

        Duration duration = Duration.between(startDate, endDates);
        System.out.println(startDate.plusDays(3));
    }


    /*页大小10  当前页1   时间段内天数5
    *
    *
    * 10
    * 11
    * 20
    * 21
    * 30
    * */


    public static void test3(int tianshu,int size,int current) {
        int total = tianshu*3;
        for (int i = (current-1)*size; i < (size*current) && i < 100; i++) {
            int page = 0;
            for (int j = 0; j < 3; j++) {
                System.out.println("第"+(3*i+j)+"行");
            }
        }
        System.out.println("======》总记录数为："+total);
    }


    public static int calcSum(String num){
        String srr[] = num.split(",");
        return srr.length;
    }

    public static void test1(){
        String startTime = "2022-11-01";
        String endTime = "2022-11-02";
        DateTimeFormatter matter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter matters = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime startDate = LocalDateTime.parse(startTime+" 00:00:00",matter);
        LocalDateTime endDate = LocalDateTime.parse(startTime+" 23:59:59",matter);

        LocalDateTime endDates = LocalDateTime.parse(endTime+" 23:59:59",matter);

        Duration duration = Duration.between(startDate, endDates);
        System.out.println(duration);
        System.out.println(duration.toDays());
        for(int i=0; i<=duration.toDays(); i++) {
            LocalDateTime startdate = startDate.plusDays(i);
            LocalDateTime enddate = endDate.plusDays(i);
            System.out.println("===========第"+i+"天===========");
            System.out.println(startdate);
            System.out.println(enddate);
        }
    }

    public static int[] test2(int size, int current){
        int arr[] = new int[100];
        for (int i = (current-1)*size; i < current*size && i<96; i++) {
            arr[i] = i;
            System.out.println(i);
        }
        return arr;
    }



}
