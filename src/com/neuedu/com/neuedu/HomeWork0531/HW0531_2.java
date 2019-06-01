package com.neuedu.com.neuedu.HomeWork0531;

public class HW0531_2 {

//    2 判断101-200之间有多少个素数，并输出所有素数。

    public static void main(String[] args) {

        int t=0;
        boolean b=false;

        for (int i=101;i<=200;i++){

            for (int j=2;j<i;j++){  //此处可以更改为j<Math.sqrt(i)
                if (i%j==0){
                    b=false;
                    break;
                }else {
                    b=true;
                }
            }

            if (b){
                t++;

                System.out.println(i);
            }

        }
        System.out.println("总共有"+t+"个素数");
    }
}
