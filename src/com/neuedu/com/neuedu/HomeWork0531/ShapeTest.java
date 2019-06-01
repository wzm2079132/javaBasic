package com.neuedu.com.neuedu.HomeWork0531;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("请输入正方形的边长");
        Scanner side = new Scanner(System.in);
        Square square = new Square();
        square.setSide(side.nextDouble());
        System.out.println("正方形的边长：" + side.nextDouble());
        square.girth();
        square.area();
        System.out.println();

        System.out.println("请输入圆形的半径");
        Scanner ridus = new Scanner(System.in);
        Circle circle = new Circle();
//        double r=ridus.nextDouble();
//        c.setRadius(r);
        circle.setRadius(ridus.nextDouble());
        System.out.println("圆的半径：" + circle.getRadius());
        circle.girth();
        circle.area();

        System.out.println("请输入矩形的宽高");
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(input.nextDouble());
        rectangle.setHeight(input.nextDouble());
        System.out.println("矩形宽度：" + rectangle.getWidth());
        System.out.println("矩形高度：" + rectangle.getHeight());
        square.girth();
        square.area();
        System.out.println();

        System.out.println("请输入三角形底边");
        Triangle triangle=new Triangle();
        triangle.setA(input.nextDouble());
        System.out.println("请输入另外两边长");
        triangle.setB(input.nextDouble());
        triangle.setC(input.nextDouble());
        System.out.println("请输入三角形底边高");
        triangle.setH(input.nextDouble());
        triangle.girth();
        triangle.area();

    }
}