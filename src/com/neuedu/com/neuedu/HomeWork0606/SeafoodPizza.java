package com.neuedu.com.neuedu.HomeWork0606;

public class SeafoodPizza extends Pizza{

    private String dosing;//配料

    public String getDosing() {
        return dosing;
    }

    public void setDosing(String dosing) {
        this.dosing = dosing;
    }

    public SeafoodPizza() {
        super();
    }

    public SeafoodPizza(String name, int price, int size, String dosing) {
        super(name, price, size);
        this.dosing = dosing;
    }

    @Override
    public Pizza showMe() {
        System.out.println("名称："+getName()+"\n价格："+getPrice()+"元\n大小："
                +getSize()+"寸\n配料："+getDosing());
        return null;
    }
}
