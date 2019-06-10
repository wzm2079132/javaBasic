package com.neuedu.com.neuedu.HomeWork0606;

public class CompereTest {

    public static void main(String[] args) {
        Student s1=new ManStudent();
        Student s2=new WomanStudent();
        Compere c1=new WomanStudent();
        Grade g=new Grade();
        g.speak(c1);
        g.speak1(s1);

    }
}
