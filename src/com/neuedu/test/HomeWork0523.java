package com.neuedu.test;

public class HomeWork0523 {
    public static void main(String[] args) {
        int num =12345;
        int result =0;
        int s =0;
        do {
            s = num % 10;
            num /= 10;
            result = result*10 + s;
        }while (num!=0);

        System.out.println(result);


    }
}
