package com.neuedu.test;

public class HW0524_1 {
    //打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如： 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
    //1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
    public static void main(String[] args) {
        int result = 100;
        int a = 0;//定义百位
        int b = 0;//定义十位
        int c = 0;//定义个位
        for (;result<=999;result++){
            a = result/100;
            b = result%100/10;
            c = result%10;
            if (result==a*a*a+b*b*b+c*c*c){
                System.out.println(result);
            }
        }
    }

}
