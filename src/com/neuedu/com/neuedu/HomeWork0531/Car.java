package com.neuedu.com.neuedu.HomeWork0531;

public abstract class Car extends Vehicle {

    private int loader;

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public Car(int wheels, double weight,int loader) {
        super(wheels, weight);
        this.loader=loader;
    }

    public abstract void loader();
}
