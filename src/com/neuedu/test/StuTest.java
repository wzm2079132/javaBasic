package com.neuedu.test;

public class StuTest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="王大";
        s1.age=7;
        s1.score=74;

        Student s2=new Student();
        s2.name="赵二";
        s2.age=8;
        s2.score=89;

        Student s3=new Student();
        s3.name="张三";
        s3.age=9;
        s3.score=66;

        Student s4=new Student();
        s4.name="李四";
        s4.age=6;
        s4.score=56;

        Student s5=new Student();
        s5.name="钱五";
        s5.age=7;
        s5.score=96;

        String n1=s1.name+s1.age+s1.score;
        String n2=s2.name+s2.age+s2.score;
        String n3=s3.name+s3.age+s3.score;
        String n4=s4.name+s4.age+s4.score;
        String n5=s5.name+s5.age+s5.score;

        int[] sco={s1.score,s2.score,s3.score,s4.score,s5.score};
        String[] n={n1,n2,n3,n4,n5};
            for (int i=0;i<sco.length;i++){
                for (int j=0;j<sco.length-1-i;j++){
                    int t=0;
                    String m="null";
                    if (sco[j]<sco[j+1]){
                        t=sco[j];
                        sco[j]=sco[j+1];
                        sco[j+1]=t;

                        m=n[j];
                        n[j]=n[j+1];
                        n[j+1]=m;
                    }
                }
            }

        System.out.println(n);
        }
    }


