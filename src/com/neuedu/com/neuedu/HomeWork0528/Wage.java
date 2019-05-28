package com.neuedu.com.neuedu.HomeWork0528;

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

    public void Swi(){
        switch (type){
            case "Worker":
                System.out.println(toString()+"工资：100元*30天");
                break;
            case "Salesman":
                System.out.println(toString()+"工资：2000元+提成");
                break;
            case "Manager":
                System.out.println(toString()+"工资：6000元/月");
                break;
            case "Floater":
                System.out.println(toString()+"工资：10元/小时");
                break;
        }

    }
}
