package com.neuedu.com.neuedu.HomeWork0613;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW0613_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(100);
        for (int i=0;i<list.size();i++){
            list.add(i,(int)(1+Math.random()*100));
        }

        System.out.println("请输入搜索值");
        int s=input.nextInt();
        listTest(list,s);


    }



    public static void   listTest(ArrayList<Integer> al, Integer s){
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i)==s){
                System.out.println("搜索值索引"+i);
            }else {
                System.out.println(-1);
            }

        }

    }
}