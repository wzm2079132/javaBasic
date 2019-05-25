package com.neuedu.test;

import java.util.Scanner;

public class HW0524_8 {
    //编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);//接收String中第一个char值
        int b = a;
        if (b>=97&&b<=122){
            b -= 32;
            a = (char) b;
            System.out.println(a);
        }else if (b>=65&&b<=106){
            System.out.println(a);
        }else {
            System.out.println("请输入正确值");
        }

    }
}
