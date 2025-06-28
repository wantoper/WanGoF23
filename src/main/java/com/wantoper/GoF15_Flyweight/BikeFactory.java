package com.wantoper.GoF15_Flyweight;

import java.util.HashSet;
import java.util.Set;

public class BikeFactory {
    private static BikeFactory bikeFactory = new BikeFactory();
    private Set<BikeFlyweight> pool = new HashSet<>();

    public static BikeFactory getInstance(){
        return bikeFactory;
    }

    public void addBike(BikeFlyweight bike){
        this.pool.add(bike);
    }

    public BikeFlyweight getBike(){
        for (BikeFlyweight bikeFlyweight : pool) {
            if (!bikeFlyweight.useState) {
                return bikeFlyweight;
            }
        }
        return null;
    }

}
