package com.wantoper.GoF02_Factory;

public class GoF02_Main {
    public static void main(String[] args) {
        //简单工厂
        CarsObject wuling = SimpleFactory.getCars("wuling");
        CarsObject tesla = SimpleFactory.getCars("tesla");
        CarsObject wuling1 = SimpleFactory.getWuling();
        CarsObject tesla1 = SimpleFactory.getTesla();

        //工厂方法
        CarsObject car = new TeslaFactoryFunc().getCar();
        CarsObject car1 = new WuLingFactoryFunc().getCar();
    }
}
