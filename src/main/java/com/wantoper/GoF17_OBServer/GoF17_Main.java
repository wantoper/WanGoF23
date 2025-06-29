package com.wantoper.GoF17_OBServer;

public class GoF17_Main {
    public static void main(String[] args) {
        PowerFullNotify powerFullNotify = new PowerFullNotify();
        PowerHalfNotify powerHalfNotify = new PowerHalfNotify();

        Computer computer = new Computer();
        computer.addNotify(powerFullNotify);
        computer.addNotify(powerHalfNotify);

        computer.charge();
    }
}
