package com.neuedu.test;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        while (true) {
            Calculator c = new Calculator();
            System.out.println("请输入运算的第一个数");
            Scanner a = new Scanner(System.in);
            c.a = a.nextDouble();
            System.out.println("请输入运算符");
            Scanner s = new Scanner(System.in);
            c.s = s.next().charAt(0);
            System.out.println("请输入运算的第二个数");
            Scanner b = new Scanner(System.in);
            c.b = b.nextDouble();
            switch (c.s) {
                case '+':
                    System.out.println("计算结果为："+c.add());
                    break;
                case '-':
                    System.out.println("计算结果为："+c.sub());
                    break;
                case '*':
                    System.out.println("计算结果为："+c.mul());
                    break;
                case '/':
                    System.out.println("计算结果为："+c.div());
                    break;
            }
        }
    }
}
