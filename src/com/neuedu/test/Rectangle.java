package com.neuedu.test;

public class Rectangle {
    int width;
    int height;
//  定义无参
    public void girth(){
        int g= width*2+height*2;
        System.out.println("长方形的周长："+g);
    }
    public  void area(){
        int area=width*height;
        System.out.println("长方形的面积："+area);
    }
//  定义一个参数
    public  void girth1(int a){
        width=a;
        height=a;
        int g= width*2+height*2;
        System.out.println("长方形的周长："+g);
    }
    public  void area1(int a){
        width=a;
        height=a;
        int area=width*height;
        System.out.println("长方形的面积："+area);
    }
//  定义两个参数
    public  void girth2(int width,int height){
        int g= width*2+height*2;
        System.out.println("长方形的周长："+g);
    }
    public  void area2(int width,int height){
        int area=width*height;
        System.out.println("长方形的面积："+area);
    }


}
