package com.neuedu.com.neuedu.test;

public class Calculator {
    double a;//定义计算的第一个数
    double b;//定义计算的第二个数
    char s;//定义运算符

//    加法
    public double add(){
        return a+b;
    }
//    减法
    public double sub(){
        return a-b;
    }
//    乘法
    public double mul(){
        return a*b;
    }
//    除法
    public double div(){
        return a/b;
    }
//    判断运算符
    public void swi(){
        switch (s) {
            case '+':
                System.out.println("计算结果为："+add());
                break;
            case '-':
                System.out.println("计算结果为："+sub());
                break;
            case '*':
                System.out.println("计算结果为："+mul());
                break;
            case '/':
                System.out.println("计算结果为："+div());
                break;
        }
    }
}
