package com.neuedu.com.neuedu.HomeWork0606;

import java.util.Scanner;

public class PizzaTest {

    public static void main(String[] args) {

        System.out.println("请输入想要的披萨种类：1 培根披萨  2 海鲜披萨");
        Scanner input=new Scanner(System.in);
        PizzaFactory p=new PizzaFactory();
        p.getPizza(input.nextInt());
    }
}
