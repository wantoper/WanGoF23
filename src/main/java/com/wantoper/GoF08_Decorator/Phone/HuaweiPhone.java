package com.wantoper.GoF08_Decorator.Phone;

public class HuaweiPhone implements Phone{
    @Override
    public void getSystemInfo() {
        System.out.println("华为手机...");
    }
}
