package com.neuedu.test;

import java.util.Scanner;

public class HW0524_4 {
    //计算9！
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int result = 1;
        for (a=a+1;a>=1;a--){
            result *= a ;
        }
        System.out.println(result);

    }
}
