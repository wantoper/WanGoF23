package com.wantoper.GoF06_Adapter.Cars;

public class XiaomiCar extends Car{
    public XiaomiCar(){
    }

    @Override
    void drive(String destination) {
        System.out.println("开着 <小米SU7> 前往->"+destination);
    }
}
