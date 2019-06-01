package com.neuedu.com.neuedu.HomeWork0531;

public class Circle extends Shap {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void girth() {
        double g=2*Math.PI*radius;
        System.out.println("圆的周长"+g);
    }

    @Override
    public void area() {
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("圆的面积"+area);
    }
}
