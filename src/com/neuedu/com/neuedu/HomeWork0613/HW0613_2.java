package com.neuedu.com.neuedu.HomeWork0613;

import java.util.ArrayList;

public class HW0613_2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(listTest(list,3));


    }



    public static int  listTest(ArrayList<Integer> al, Integer s){
        return al.indexOf(s);
    }
}