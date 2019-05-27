package com.neuedu.test;

public class Student {

    String name;
    int age;
    double score;


    public double getScore() {
        return score;
    }


    public void setScore(double score) {
        this.score = score;
    }


    public Student(String name, int age, double score) {
        super();
        this.name = name;
        this.age = age;
        this.score = score;
    }


    public String toString() {
        return "学生 [姓名=" + name + ", 年龄=" + age
                + ", 成绩=" + score + "]";
    }


    public static void sort(Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            for (int j = i; j < stu.length; j++) {
                if (stu[i].getScore() < stu[j].getScore()) {
                    Student tem = stu[j];
                    stu[j] = stu[i];
                    stu[i] = tem;
                }
            }

        }
        System.out.println("成绩第一" + stu[0].toString());
        System.out.println("成绩第二" + stu[1].toString());
        System.out.println("成绩第三" + stu[2].toString());
        System.out.println("成绩第四" + stu[3].toString());
        System.out.println("成绩第五" + stu[4].toString());
    }

}