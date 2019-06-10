package com.neuedu.com.neuedu.HomeWork0606;

public abstract class Pizza {
    private String name;//定义名字
    private int price;//定义价格
    private int size;//定义大小

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pizza(){

    }

    public Pizza(String name,int price,int size){
        this.name=name;
        this.price=price;
        this.size=size;
    }

    public abstract Pizza showMe();



}
