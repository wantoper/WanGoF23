package com.wantoper.GoF17_OBServer;

public class PowerHalfNotify implements Notifyer {
    @Override
    public void notifyd(int power) {
        if(power ==  50){
            System.out.println("电源已经充到一半了！");
        }
    }
}
