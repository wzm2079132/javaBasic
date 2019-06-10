package com.neuedu.com.neuedu.HomeWork0606;

public class WomanStudent extends Student implements Compere {

    @Override
    public void com() {
        System.out.println("女士们，先生们，大家好，我是主持人......");
    }

    @Override
    public void eat() {
        System.out.println("我是女同学，我嗑瓜子，吃水果...");
    }
}
