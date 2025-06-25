package com.wantoper.GoF02_Factory;

public interface CarsObject {
    void name();
}

class Wuling implements CarsObject{
    @Override
    public void name() {
        System.out.println("五菱宏光");
    }
}

class Tesla implements CarsObject{
    @Override
    public void name() {
        System.out.println("特斯拉");
    }
}