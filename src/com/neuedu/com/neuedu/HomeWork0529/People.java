package com.neuedu.com.neuedu.HomeWork0529;

public class People extends Monkey {

//    People(){
//        super();
//    }

    People(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name+"说：“小样的，不错嘛！会说话了！”");
    }

    void think(){
        System.out.println(name+"说：“别说话！认真思考！”");
    }
}
