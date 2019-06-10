package com.neuedu.com.neuedu.HomeWork0606;

import java.util.Scanner;

public class VehicleTest {

    public static void main(String[] args) {

        System.out.println("请输入你想选择的车型：1 轿车  2 客车");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();

        Car car=new Car();
        Bus bus=new Bus();

        if (a==1){
            System.out.println("请输入你想选择的车品牌：1 别克商务舱GL8  2 宝马55i  3 别克林荫大道");
            car.type=input.next();
            System.out.println("请输入你想租赁的天数");
            car.days=input.nextInt();
            car.costRent(car.days);
        }else if (a==2){
            System.out.println("请输入你想选择的座位数");
            bus.seats=input.nextInt();
            System.out.println("请输入你想租赁的天数");
            bus.days=input.nextInt();
            bus.costRent(bus.days,bus.seats);
        }
    }
}
