package com.neuedu.com.neuedu.test;

import java.util.Scanner;

public class HW0524_6 {
    //一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int a = i/10000;//定义万位
        int b = i/1000-a*10;//定义千位
        int c = i%100/10;//定义十位
        int d = i%10;//定义个位
        if (i>=10000&&i<=99999){
            if (a==d&&b==c){
                System.out.println("此数是回文数");
            }else {
                System.out.println("此数不是回文数");
            }
        }else {
            System.out.println("请输入正确的五位数");
        }
    }
}
