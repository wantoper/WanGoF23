package com.wantoper.GoF10_State.States;

public class PowerOffState extends PhoneState{

    @Override
    public void OpenApp() {
        System.out.println("电源关闭无法正常使用...");
    }
}
