package com.neuedu.com.neuedu.test;

public class HW0524_5 {
    //分别计算1-100之间的奇数和 和偶数和
    public static void main(String[] args) {
        int i = 0;
        int o = 0;//定义奇数的和
        int e = 0;//定义偶数的和
        for (;i<=100;i++){
            if (i%2==0){
                e += i;
            }else {
                o += i;
            }
        }
        System.out.println("奇数和："+o);
        System.out.println("偶数和："+e);
    }
}
