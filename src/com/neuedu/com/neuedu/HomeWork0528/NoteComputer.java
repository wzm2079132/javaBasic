package com.neuedu.com.neuedu.HomeWork0528;

public class NoteComputer {
    char color;
    int cpu;

    public NoteComputer(){

    }

    public NoteComputer(char color,int cpu){
        this.color=color;
        this.cpu=cpu;
    }

    public void printC(){
        System.out.println("笔记本颜色："+color+"，cpu型号："+cpu);
    }

}
