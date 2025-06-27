package com.wantoper.GoF06_Adapter.Cars;

public class Driver {
    private Car car;

    public Driver(Car car){
        this.car = car;
    }

    public void goTo(String destination){
        this.car.drive(destination);
    }
}
