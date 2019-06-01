package com.neuedu.com.neuedu.HomeWork0531;

public class Triangle extends Shap{
    private double a,b,c,h;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public void girth() {
        double g=a+b+c;
        System.out.println("三角形周长"+g);
    }

    @Override
    public void area() {
        double area=a*h/2;
        System.out.println("矩形面积"+area);
    }
}
