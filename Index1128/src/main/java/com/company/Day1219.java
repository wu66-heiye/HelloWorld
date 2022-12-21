package com.company;

import java.util.Scanner;

public class Day1219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = reword(s);
        System.out.println(res);
    }

    public static String reword(String s){
        if (s.isEmpty())
            return "输入为空！";
        else{
            char[] res = new char[s.length()];
            for (int i = s.length()-1; i >= 0 ; i--) {
                res[s.length()-1-i] = s.charAt(i);
            }
            System.out.println(res);
            return null;
        }
    }

}
