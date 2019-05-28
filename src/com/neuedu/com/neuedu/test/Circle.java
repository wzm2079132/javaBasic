package com.neuedu.com.neuedu.test;

public class Circle {
    private float r;

    public void setR(float r){
        if (r<0){
            System.out.println("输入非法值");
        }else {
            float g=(float)(2*Math.PI*r);
            System.out.println("圆的周长："+g);

            float area=(float)(2*Math.PI*Math.pow(r,2));//Math.pow(被次方数，次方数)
            System.out.println("圆的面积："+area);
        }
    }



}
