package com.neuedu.com.neuedu.HomeWork0531;

import java.util.Scanner;

//验证“鬼谷猜想”：对任意自然数，若是奇数，就对它乘以 3 再加 1；若是
//
//偶数，就对它除以 2，这样得到一个新数，再按上述计算规则进行计算，一直进
//
//行下去，最终必然得到 1。

public class HW0531_1 {

    public static void main(String[] args) {
        int a;

        System.out.println("请输入数值");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        while (a!=1){
            if (a%2!=0){
                a=a*3+1;
            }else {
                a/=2;
            }
            System.out.println(a);
        }
        System.out.println(a);
    }

}

