package com.neuedu.com.neuedu.HomeWork0528;

public class PersonCreate {
    public static void main(String[] args) {
        Person person1=new Person("zhangsan",33,1.73);
        Person person2=new Person("lisi",44,1.74);

        person1.sayHello();
        person2.sayHello();
    }
}
