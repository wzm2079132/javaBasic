package com.neuedu.com.neuedu.HomeWork0531;

import java.util.Scanner;

public class HW0531_3 {
//    输入两个正整数m和n，求其最大公约数和最小公倍数。

    public static void main(String[] args) {
    //        辗转相除法  求最大公约数
        int a=1,m,n,b,c,d;
        System.out.println("请输入两个整数");
        Scanner input=new Scanner(System.in);
        m=input.nextInt();
        n=input.nextInt();

        c=m;
        d=n;

        if (c<d){
            b=c;
            c=d;
            d=b;
        }


        while (a!=0){
            a=c%d;
            c=d;
            d=a;
        }

        System.out.println("最大公约数是："+c);

        System.out.println("最小公倍数是："+m*n/c);//最小公倍数=两数之积除以最大公约数


    }
}
