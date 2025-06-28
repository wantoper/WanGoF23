package com.wantoper.GoF10_State.States;

public class PowerOnState extends PhoneState{
    @Override
    public void OpenApp() {
        System.out.println("打开了APP...");
    }
}
