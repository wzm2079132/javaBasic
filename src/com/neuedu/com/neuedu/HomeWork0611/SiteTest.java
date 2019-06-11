package com.neuedu.com.neuedu.HomeWork0611;

import java.util.ArrayList;
import java.util.List;


public class SiteTest {
    public static void main(String[] args) {

        List<Site> list=new ArrayList<>();
        list.add(new Site("张三","东一街","郑州市","河南省","中国"));
        list.add(new Site("李四","东二街","郑州市","河南省","中国"));
        list.add(new Site("赵五","东三街","郑州市","河南省","中国"));

        for (Site s:list
             ) {
            System.out.println(s);
        }
    }
}
