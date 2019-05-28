package com.neuedu.com.neuedu.HomeWork0528;

public class Point {
    int x;
    int y;

    public Point(){

    }

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void movePoint(int dx,int dy){
        x=dx;
        y=dy;
        System.out.println("移动之后的位置：（"+x+"，"+y+"）");
    }


}
