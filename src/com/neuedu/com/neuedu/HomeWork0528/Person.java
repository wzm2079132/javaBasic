package com.neuedu.com.neuedu.HomeWork0528;

public class Person {
    String name;
    int age;
    double height;

    public Person(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;

    }

    public void sayHello(){
        System.out.println("hello,my name is "+name);
    }

}
