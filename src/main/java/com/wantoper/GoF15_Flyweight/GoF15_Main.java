package com.wantoper.GoF15_Flyweight;

import com.wantoper.GoF15_Flyweight.Bikes.MoBike;

public class GoF15_Main {
    public static void main(String[] args) {
        BikeFactory instance = BikeFactory.getInstance();
        instance.addBike(new MoBike("摩拜1号"));
        instance.addBike(new MoBike("摩拜2号"));
        instance.addBike(new MoBike("小吉1号"));

        BikeFlyweight bike = instance.getBike();
        bike.use();
        BikeFlyweight bike2 = instance.getBike();
        bike2.use();
        BikeFlyweight bike3 = instance.getBike();
        bike3.use();

        BikeFlyweight bike4 = instance.getBike();
        System.out.println(bike4 == null);

        bike.back();

        bike4 = instance.getBike();
        System.out.println(bike4 == null);
        bike4.use();
    }
}
