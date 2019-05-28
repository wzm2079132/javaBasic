package com.neuedu.com.neuedu.HomeWork0528;

import java.util.Scanner;

// 有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩
public class Student {

    String sno;
    String name;

    public void Run() {
        double avg = 0;
        for (int i = 0; i < 5; i++) {
            Scanner stu1 = new Scanner(System.in);
            System.out.print("请输入学生的学号:");
            sno = stu1.next();

            Scanner stu2 = new Scanner(System.in);
            System.out.print("请输入学生的姓名:");
            name = stu2.next();

            Scanner stu3 = new Scanner(System.in);
            System.out.println("请输入学生的成绩:");
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = stu3.nextInt();//给数组for循环键盘录入值;
            }
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            avg = sum / 3;
            System.out.println(name + "的学号为：" + sno);
            System.out.println("三科的平均成绩为：" + avg);
            System.out.println();
        }

    }



    //    private String name;
//    int stuNum;
//    double score1;//定义第一门课成绩
//    double score2;//定义第二门课成绩
//    double score3;//定义第三门课成绩
//
//
//    public Student(String name, int stuNum, double score1,double score2,double score3) {
//        this.name = name;
//        this.stuNum = stuNum;
//        this.score1 = score1;
//        this.score2 = score2;
//        this.score3 = score3;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStuNum(int stuNum) {
//        this.stuNum = stuNum;
//    }
//
//
//    public void setScore1(double score1) {
//        this.score1 = score1;
//    }
//    public void setScore2(double score2) {
//        this.score2 = score2;
//    }
//
//    public void setScore3(double score3) {
//        this.score3 = score3;
//    }
//
//    public double getScore1() {
//        return score1;
//    }
//
//    public double getScore2() {
//        return score2;
//    }
//
//    public double getScore3() {
//        return score3;
//    }
}