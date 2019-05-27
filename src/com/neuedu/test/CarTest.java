package com.neuedu.test;

public class CarTest {
    public static void main(String[] args) {
        Car aodi=new Car();
        aodi.mark="奥迪";
        aodi.price=350000;
        aodi.speed=80;

        aodi.printC();
        aodi.drive();
        aodi.speedChange(110);

        System.out.println("------分割线---------");
        Car benchi=new Car();
        benchi.mark="奔驰";
        benchi.price=400000;
        benchi.speed=80;

        benchi.printC();
        benchi.drive();
        benchi.speedChange(100);





    }
}
