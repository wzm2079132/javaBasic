package com.neuedu.test;

public class Circle {
    float r;

    public void setR(float r){
        if (r<0){
            System.out.println("输入非法值");
        }else {
            float g=(float)(2*31.4*r);
            System.out.println("圆的周长："+g);

            float area=(float)(2*31.4*r*r);
            System.out.println("圆的面积："+area);
        }
    }



}
