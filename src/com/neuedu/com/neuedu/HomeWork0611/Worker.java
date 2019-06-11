package com.neuedu.com.neuedu.HomeWork0611;


import java.util.List;

public class Worker {

    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Worker(){

    }

    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }



    public  void work(){

        System.out.println(getName()+"正在工作");;
    }

    @Override
    public String toString() {
        return "名字：" + name  +
                ", 年龄：" + age +
                ", 工资：" + salary;
    }




}
