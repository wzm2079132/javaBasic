package com.neuedu.com.neuedu.HomeWork0528;

import java.util.Scanner;

public class StuTest {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Student[] students=new Student[5];
        float firstsum=0f;
        float secondsum=0f;
        float thirdsum=0f;
        for (int i=0;i<students.length;i++){
            Student student=new Student();
            System.out.println("请输入学生姓名");
            String sname=input.next();
            System.out.println("请输入学号");
            String sno=input.next();
            Course[] courses=new Course[3];
            for (int j=0;j<courses.length;j++){
                System.out.println("请输入课程名称");
                String cname=input.next();
                System.out.println("请输入课程成绩");
                float score=input.nextFloat();
                Course course=new Course();
                course.setCname(cname);
                course.setScore(score);
                courses[j]=course;
            }
            student.setName(sname);
            student.setSno(sno);
            student.setCourse(courses);
            students[i]=student;

            firstsum += courses[1].getScore();
            secondsum += courses[2].getScore();
            thirdsum += courses[3].getScore();

        }


        for (Student s:students) {
            System.out.println(s);
        }

        System.out.println("第一科平均成绩"+firstsum/3);
        System.out.println("第二科平均成绩"+secondsum/3);
        System.out.println("第三科平均成绩"+thirdsum/3);






//        Student student = new Student();
//        student.Run();


//        double sum1 = 0;
//        double sum2 = 0;
//        double sum3 = 0;
//        double avg1 = 0;
//        double avg2 = 0;
//        double avg3 = 0;
//
//
//        Student[] stu = new Student[5];
////        Scanner input=new Scanner(System.in);
//        for (int i = 1; i <= 5; i++) {
//            Student student=new Student();
//            Scanner input1 = new Scanner(System.in);
//            System.out.println("请输入学生姓名");
//            stu[i].setName(input1.next());
////            String name=input1.next();
//
//            System.out.println("请输入学号");
//            Scanner input2 = new Scanner(System.in);
//            stu[i].setStuNum(input2.nextInt());
////            int stuNum = input2.nextInt();
//
//            System.out.println("请输入第一门课成绩");
//            Scanner input3 = new Scanner(System.in);
//            stu[i].setScore1(input3.nextDouble());
//
//            System.out.println("请输入第二门课成绩");
//            Scanner input4 = new Scanner(System.in);
//            stu[i].setScore2(input4.nextDouble());
//
//            System.out.println("请输入第三门课成绩");
//            Scanner input5 = new Scanner(System.in);
//            stu[i].setScore3(input5.nextDouble());
//            double score1 = stu[i].getScore1();
//            double score2 = stu[i].getScore2();
//            double score3 = stu[i].getScore3();
//
//            sum1 += score1;
//            sum2 += score2;
//            sum3 += score3;
//        }
//        avg1 = sum1 / 3;
//        avg2 = sum2 / 3;
//        avg3 = sum3 / 3;
//        System.out.println("第一门课的平均成绩为:" + avg1);
//        System.out.println("第二门课的平均成绩为:" + avg2);
//        System.out.println("第三门课的平均成绩为:" + avg3);


    }
}
