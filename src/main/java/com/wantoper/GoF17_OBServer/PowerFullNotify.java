package com.wantoper.GoF17_OBServer;

public class PowerFullNotify implements Notifyer {
    @Override
    public void notifyd(int power) {
        if (power == 100) {
            System.out.println("电源已经满了！");
        }
    }
}
