package com.neuedu.com.neuedu.HomeWork0531;

public class Truck extends Car {
    private double payload;

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public Truck(int wheels, double weight, int loader,double payload) {
        super(wheels, weight, loader);
        this.payload=payload;
    }

    public void payload(){
        System.out.println("车载重"+getPayload());
    }

    @Override
    public void loader() {
        System.out.println("车载人数"+getLoader());
    }

    @Override
    public void wheels() {
        System.out.println("车轮数"+getWheels());
    }

    @Override
    public void weight() {
        System.out.println("车重"+getWeight());
    }
}
