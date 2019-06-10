package com.neuedu.com.neuedu.HomeWork0606;

public class BaconPizza extends Pizza {

    private int gramNum;//培根个数

    public int getGramNum() {
        return gramNum;
    }

    public void setGramNum(int gramNum) {
        this.gramNum = gramNum;
    }

    public BaconPizza(){
        super();
    }

    public BaconPizza(String name,int price,int size,int gramNum){
        super(name, price, size);
        this.gramNum=gramNum;
    }

    @Override
    public Pizza showMe() {
        System.out.println("名称："+getName()+"\n价格："+getPrice()+"元\n大小："
                +getSize()+"寸\n培根克数："+getGramNum());
        return null;
    }
}
