package com.wantoper.GoF15_Flyweight.Bikes;

import com.wantoper.GoF15_Flyweight.BikeFlyweight;

public class MoBike extends BikeFlyweight {
    private String name;

    public MoBike(String name){
        this.name = name;
    }

    @Override
    public void use() {
        this.useState = true;
        System.out.println("正在使用"+name+"....");
    }

    @Override
    public void back() {
        this.useState = false;
        System.out.println("已经归还"+name+"....");
    }
}
