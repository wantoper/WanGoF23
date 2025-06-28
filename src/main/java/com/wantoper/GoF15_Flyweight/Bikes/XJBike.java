package com.wantoper.GoF15_Flyweight.Bikes;

import com.wantoper.GoF15_Flyweight.BikeFlyweight;

public class XJBike extends BikeFlyweight {
    private String name;

    public XJBike(String name){
        this.name = name;
    }

    @Override
    public void back() {
        System.out.println("感谢使用XJ单车... 请归还头盔");
        this.useState = false;
        System.out.println("已经归还"+name+"....");
    }

    @Override
    public void use() {
        System.out.println("感谢使用XJ单车... 请佩戴头盔");
        this.useState = true;
        System.out.println("正在使用"+name+"....");
    }
}
