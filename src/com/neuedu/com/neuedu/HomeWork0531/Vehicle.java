package com.neuedu.com.neuedu.HomeWork0531;

public abstract class Vehicle {
    private int wheels;
    private double weight;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public abstract void wheels();
    public abstract void weight();
}
