package com.wantoper.GoF10_State;

public class GoF10_Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.OpenApp();

        phone.startup();
        phone.OpenApp();

        phone.shutdown();
        phone.OpenApp();
    }
}
