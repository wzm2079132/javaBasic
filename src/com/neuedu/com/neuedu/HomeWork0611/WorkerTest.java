package com.neuedu.com.neuedu.HomeWork0611;

import java.util.ArrayList;

import java.util.List;

public class WorkerTest {

    public static void main(String[] args) {


            List<Worker> list=new ArrayList();
            list.add(new Worker("zhang3",18,3000));
            list.add(new Worker("li4",25,3500));
            list.add(new Worker("wang5",22,3200));
            for (int i=0;i<list.size();i++){
                if (list.get(i).getName().equals("li4")){
                    list.add(i,new Worker("zhao6",24,3300));
                    break;
                }
            }
        for (int i=0;i<list.size();i++){
            if (list.get(i).getName().equals("wang5")){
                list.remove(i);
                break;
            }
        }

            for (Worker w:list
            ) {
                System.out.println(w);
            }

            for (int i=0;i<list.size();i++){

                list.get(i).work();

            }


        }
    }
