package com.neuedu.com.neuedu.HomeWork0531;

public class Square extends Shap{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void girth() {
        double g=4*side;
        System.out.println("正方形周长"+g);
    }

    @Override
    public void area() {
        double area=Math.pow(side,2);
        System.out.println("正方形面积"+area);
    }
}
