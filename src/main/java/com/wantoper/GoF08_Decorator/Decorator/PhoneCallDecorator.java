package com.wantoper.GoF08_Decorator.Decorator;

import com.wantoper.GoF08_Decorator.Phone.Phone;

public class PhoneCallDecorator implements Phone {
    private Phone phone;

    public PhoneCallDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void getSystemInfo() {
        phone.getSystemInfo();
    }

    public void Call(){
        System.out.println("打电话...");
    }
}
