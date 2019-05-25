package com.neuedu.test;

import java.util.Scanner;

public class HW0524_10 {
    //一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int a;
        int sum = 0;//定义各位数字之和
        do {
            a = i%10;
            i = i/10;
            sum += a;
        }while (a!=0);
        if (sum%9==0){
            System.out.println("这个整数的各位数字之和能被9整除");
            if (i%9==0){
                System.out.println("这个整数能被9整除");
            }else {
                System.out.println("这个整数不能被9整除");
            }
        }else {
            System.out.println("这个整数的各位数字之和不能被9整除");
        }

    }
}
