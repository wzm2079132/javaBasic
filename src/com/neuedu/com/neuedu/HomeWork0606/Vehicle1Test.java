package com.neuedu.com.neuedu.HomeWork0606;

public class Vehicle1Test {

    public static void main(String[] args) {

        test(new Steamer());
        test(new Automobile());
        test(new Airplane());

    }

    public static void test(Vehicle1 vehicle1){
        vehicle1.drive();
    }
}
