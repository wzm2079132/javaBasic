package com.neuedu.com.neuedu.HomeWork0606;

import java.util.Scanner;

public class PizzaFactory {

    public void getPizza(int order) {


        Scanner input = new Scanner(System.in);

        if (order == 1) {
            System.out.println("请输入培根个数");
            int gramNum = input.nextInt();
            System.out.println("请输入披萨大小");
            int size = input.nextInt();
            System.out.println("请输入披萨价格");
            int price = input.nextInt();

            Pizza pizza = new BaconPizza("培根披萨", price, size, gramNum);
            pizza.showMe();
        } else if (order == 2) {
            System.out.println("请输入配料");
            String dosing = input.next();
            System.out.println("请输入披萨大小");
            int size = input.nextInt();
            System.out.println("请输入披萨价格");
            int price = input.nextInt();

            Pizza pizza = new SeafoodPizza("海鲜披萨", price, size, dosing);
            pizza.showMe();
        } else {
            System.out.println("请输入1或者2");
        }



    }
}
