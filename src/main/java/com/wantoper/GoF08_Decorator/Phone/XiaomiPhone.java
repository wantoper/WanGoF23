package com.wantoper.GoF08_Decorator.Phone;

public class XiaomiPhone implements Phone{

    @Override
    public void getSystemInfo() {
        System.out.println("小米手机...");
    }
}
