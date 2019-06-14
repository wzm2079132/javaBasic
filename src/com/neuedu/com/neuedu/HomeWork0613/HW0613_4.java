package com.neuedu.com.neuedu.HomeWork0613;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HW0613_4 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        Set<Character> set=new HashSet<>();
        System.out.println("请输入字符串");
        char[] chars=input.next().toCharArray();
        for (int i=0;i<chars.length;i++){
            set.add(chars[i]);
        }

        for (Character c:set
             ) {
            System.out.println(c);
        }
    }
}
