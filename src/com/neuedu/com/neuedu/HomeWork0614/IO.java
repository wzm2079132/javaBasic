package com.neuedu.com.neuedu.HomeWork0614;

import java.io.*;

public class IO {

    public static void main(String[] args) {

        File file=new File("E:\\学习视频\\06-14\\6.15作业.txt");

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Reader reader=null;
        String str=null;
        char[] chars=new char[(int)file.length()];
        try {
            reader=new FileReader(file);
            reader.read(chars);
            str=new String(chars);
            System.out.println(new String(chars));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File file1=new File("E:\\学习视频\\06-13\\1.txt");
        if (!file1.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Writer writer=null;
        try {
            writer=new FileWriter(file1,false);
            writer.write(str);
            System.out.println("文件复制完成");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
