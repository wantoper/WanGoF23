package com.wantoper.GoF06_Adapter.Cars;

public class Driver {

    public Driver(){
    }

    public void goTo(vehicle vehicles,String destination){
        vehicles.drive(destination);
    }
}
