package com.wantoper.GoF06_Adapter.Cars;

public class HauweiCar extends Car{

    public HauweiCar(){
    }

    @Override
    void drive(String destination) {
        System.out.println("开着 <问界M9> 前往->"+ destination);
    }
}
