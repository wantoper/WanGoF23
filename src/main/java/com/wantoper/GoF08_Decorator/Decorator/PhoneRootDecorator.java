package com.wantoper.GoF08_Decorator.Decorator;

import com.wantoper.GoF08_Decorator.Phone.Phone;

public class PhoneRootDecorator implements Phone {
    private Phone phone;

    public PhoneRootDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void getSystemInfo() {
        phone.getSystemInfo();
    }

    public void getRoot(){
        System.out.println("获取了管理员权限");
    }
}
