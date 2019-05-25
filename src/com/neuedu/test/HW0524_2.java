package com.neuedu.test;

import java.util.Scanner;

public class HW0524_2 {

    //题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//控制台输入
        int score = input.nextInt();
        if (score>=90&&score<=100){
            System.out.println("成绩为：A");
        }else if (score>=60&&score<90){
            System.out.println("成绩为：B");
        }else if (score>=0&&score<60){
            System.out.println("成绩为：C");
        }else if (score<0||score>100){
            System.out.println("请输入正确值");
        }
    }

}
