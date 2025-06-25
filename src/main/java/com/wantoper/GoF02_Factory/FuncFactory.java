package com.wantoper.GoF02_Factory;

public interface FuncFactory {
    CarsObject getCar();
}

class WuLingFactoryFunc implements FuncFactory{

    @Override
    public CarsObject getCar() {
        return new Wuling();
    }
}

class TeslaFactoryFunc implements FuncFactory{

    @Override
    public CarsObject getCar() {
        return new Tesla();
    }
}