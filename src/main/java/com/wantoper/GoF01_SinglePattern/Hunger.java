package com.wantoper.GoF01_SinglePattern;

public class Hunger {
    private Hunger(){}

    private static final Hunger hunger = new Hunger();

    public static Hunger getInstance(){
        return hunger;
    }

}
