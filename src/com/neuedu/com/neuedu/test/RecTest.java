package com.neuedu.com.neuedu.test;

public class RecTest {
    public static void main(String[] args) {
        Rectangle g =new Rectangle();

        System.out.println("无参");
        g.girth();
        g.area();

        System.out.println("有一个参数");
        g.girth1(2);
        g.area1(2);

        System.out.println("有两个参数");
        g.girth2(2,3);
        g.area2(2,3);
    }
}
