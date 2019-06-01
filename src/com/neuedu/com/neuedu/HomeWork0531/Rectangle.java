package com.neuedu.com.neuedu.HomeWork0531;

public class Rectangle extends Shap{

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void girth() {
        double g=width*2+height*2;
        System.out.println("矩形周长"+g);
    }

    @Override
    public void area() {
        double area=width*height;
        System.out.println("矩形面积"+area);
    }
}
