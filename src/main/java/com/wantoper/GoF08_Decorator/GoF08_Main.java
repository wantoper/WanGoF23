package com.wantoper.GoF08_Decorator;

import com.wantoper.GoF08_Decorator.Decorator.PhoneCallDecorator;
import com.wantoper.GoF08_Decorator.Decorator.PhoneRootDecorator;
import com.wantoper.GoF08_Decorator.Phone.HuaweiPhone;
import com.wantoper.GoF08_Decorator.Phone.XiaomiPhone;

public class GoF08_Main {
    public static void main(String[] args) {
//      不需要修改某个类代码即可让这个类 修改\新增 一个功能

        PhoneRootDecorator huaweiPhoneRootDecorator = new PhoneRootDecorator(new HuaweiPhone());
        huaweiPhoneRootDecorator.getRoot();         //新功能
        huaweiPhoneRootDecorator.getSystemInfo();   //旧功能

        PhoneRootDecorator xiaomiPhoneRootDecorator = new PhoneRootDecorator(new XiaomiPhone());
        xiaomiPhoneRootDecorator.getRoot();         //新功能
        xiaomiPhoneRootDecorator.getSystemInfo();   //旧功能



        PhoneCallDecorator huaweiPhoneCallDecorator = new PhoneCallDecorator(new HuaweiPhone());
        huaweiPhoneCallDecorator.Call();            //新功能
        huaweiPhoneCallDecorator.getSystemInfo();   //旧功能

        PhoneCallDecorator xiaomiPhoneCallDecorator = new PhoneCallDecorator(new HuaweiPhone());
        xiaomiPhoneCallDecorator.Call();            //新功能
        xiaomiPhoneCallDecorator.getSystemInfo();   //旧功能
    }
}
