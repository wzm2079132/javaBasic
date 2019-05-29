package com.neuedu.com.neuedu.HomeWork0529;

public class MonTest {

    public static void main(String[] args) {

        Monkey monkey=new Monkey("monkey");
        monkey.speak();
        System.out.println();

        People people=new People("people");
        people.speak();
        people.think();
    }
}
