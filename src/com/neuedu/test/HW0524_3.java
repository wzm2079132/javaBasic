package com.neuedu.test;

public class HW0524_3 {
    //题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    // 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
    public static void main(String[] args) {
        int a = 0;//定义百位
        int b = 0;//定义十位
        int c = 0;//定义个位
        int i = 0;
        int result;
        for (a=1;a<=4;a++){
            for (b=1;b<=4;b++){
                for (c=1;c<=4;c++){
                    if (a!=b&&b!=c&&c!=a){
                        i++;
                        result = a*100+b*10+c;
                        System.out.println(result);
                    }
                }
            }
        }
        System.out.println("能组成"+i+"个互不相同且无重复数字的三位数");
    }


}
