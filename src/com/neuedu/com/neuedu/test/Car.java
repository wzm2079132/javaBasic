package com.neuedu.com.neuedu.test;

public class Car {
    String mark;//定义品牌
    int price;//定义价钱
    int speed;//定义速度

    //驾驶功能
    public void drive(){
        System.out.println("当前速度："+speed);
        System.out.println("启动自动驾驶");
    }
    //变速功能
    public void speedChange(int newSpeed){
        speed= newSpeed;
        System.out.println("变速之后的速度："+speed);
    }

    public void printC(){
        System.out.println("品牌："+mark);
        System.out.println("价钱："+price);
    }

}
