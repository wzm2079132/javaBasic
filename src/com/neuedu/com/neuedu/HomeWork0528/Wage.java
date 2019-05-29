package com.neuedu.com.neuedu.HomeWork0528;

import java.util.Scanner;

public class Wage {
    String name;
    char sex;
    int birthday;
    String type;

    public Wage(String name,char sex,int birthday,String type){
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
        this.type=type;
    }

    @Override
    public String toString() {
        return "name=" + name  +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", type='" + type +", " ;
    }

    public void computeSalay(){
        switch (type){
            case "Worker":
                int d;
                System.out.println("请输入工作天数");
                Scanner input=new Scanner(System.in);
                d=input.nextInt();
                if (d>=0&&d<=31){
                    System.out.println(toString()+"工资(元)："+100*d);
                }else {
                    System.out.println("请输入正确天数");
                }
                break;
            case "Salesman":
                double c;
                System.out.println("请输入该销售的提成");
                Scanner input1=new Scanner(System.in);
                c=input1.nextDouble();
                if (c>=0){
                    System.out.println(toString()+"工资(元)："+(2000+c));
                }else {
                    System.out.println("请输入正确的提成数");
                }
                break;
            case "Manager":
                System.out.println(toString()+"工资：6000元/月");
                break;
            case "Floater":
                int h;
                System.out.println("请输入该小时工的小时数");
                Scanner input2=new Scanner(System.in);
                h=input2.nextInt();
                if (h>=0){
                    System.out.println(toString()+"工资(元)："+(10*h));
                }else {
                    System.out.println("请输入正确的小时数");
                }
                break;
        }

    }
}
