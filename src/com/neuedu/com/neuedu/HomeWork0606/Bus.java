package com.neuedu.com.neuedu.HomeWork0606;

public class Bus extends Vehicle{

    int seats;//座位数



    @Override
    public void costRent(int days){
        super.days=days;
    }
    public void costRent(int days,int seats) {
        this.days=days;
        this.seats=seats;

        if (seats<=16){
            cost=days*800;
        }else {
            cost=days*1500;
        }

        System.out.println("租赁"+seats+"座的客车，共"+days+"天，总租赁费："+cost);
    }
}
