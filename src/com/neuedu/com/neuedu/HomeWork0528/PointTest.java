package com.neuedu.com.neuedu.HomeWork0528;

public class PointTest {
    public static void main(String[] args) {

        Point p1=new Point(20,50);
        Point p2=new Point(30,60);

        p1.movePoint(120,150);
        System.out.println(p1.string());
        p2.movePoint(130,160);
        System.out.println(p2.string());
    }
}
