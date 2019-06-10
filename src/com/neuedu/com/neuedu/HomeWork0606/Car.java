package com.neuedu.com.neuedu.HomeWork0606;

public class Car extends Vehicle {

    String type;//车类型，1：别克商务 2：宝马550i 3：别克林荫大道


    @Override
    public void costRent(int days) {
        this.days=days;

        switch (type){
            case "1": cost=days*600;
                System.out.println("租赁别克商务舱GL8，共"+days+"天，总租赁费："+cost);
                break;
            case "2": cost=days*500;
                System.out.println("租赁宝马55i，共"+days+"天，总租赁费："+cost);
                break;
            case "3": cost=days*300;
                System.out.println("租赁别克林荫大道，共"+days+"天，总租赁费："+cost);
                break;
        }
    }
}
