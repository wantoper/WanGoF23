package com.wantoper.GoF15_Flyweight;

public abstract class BikeFlyweight {
    protected boolean useState;

    public abstract void back();

    public abstract void use();

    public boolean getUseState(){
        return useState;
    }
}
