package com.neuedu.test;

public class HomeWork0523 {
    public static void main(String[] args) {
        int num=1234;
        int result=0;
        int s=0;
        int i=1000;
        do {
            s = num % 10;
            num /= 10;
            s*=i;
            i /=10;
            result +=s;
        }while (num!=0);

        System.out.println(result);


    }
}
