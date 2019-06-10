package com.neuedu.com.neuedu.HomeWork0606;

public abstract class Vehicle {

    String number;//车牌号
    String mark;//品牌
    char color;//颜色
    int mileage;//里程
    int cost;//总花费
    int days;//租赁天数

    public abstract void costRent(int days);

}
