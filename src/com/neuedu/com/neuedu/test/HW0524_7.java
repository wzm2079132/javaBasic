package com.neuedu.com.neuedu.test;

import java.util.Scanner;

public class HW0524_7 {
    //判断一个年份是平年还是闰年
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i%4==0){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
