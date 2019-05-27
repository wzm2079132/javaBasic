package com.neuedu.test;

import java.util.Scanner;

public class CirTest {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        Circle c=new Circle();
        c.r=input.nextFloat();
        c.setR(c.r);
    }
}
