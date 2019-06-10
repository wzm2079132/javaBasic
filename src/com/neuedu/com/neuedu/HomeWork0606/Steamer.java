package com.neuedu.com.neuedu.HomeWork0606;

public class Steamer implements Vehicle1 {
    private int speed;//定义速度
    private int num;//定义载人数量

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void window(){
        System.out.println("轮船打开窗户");
    }

    @Override
    public void drive() {
        System.out.println("轮船开船");
    }
}
