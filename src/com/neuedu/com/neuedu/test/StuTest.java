package com.neuedu.com.neuedu.test;

public class StuTest {
    public static void main(String[] args) {
        Student s1=new Student("王大",8,95.0);
        Student s2=new Student("赵二",9,72.5);
        Student s3=new Student("张三",7,88.5);
        Student s4=new Student("李四",8,61.5);
        Student s5=new Student("钱五",6,85.0);

        Student[] stu=new Student[5];
        stu[0]=s1;
        stu[1]=s2;
        stu[2]=s3;
        stu[3]=s4;
        stu[4]=s5;
        Student.sort(stu);

    }

}


