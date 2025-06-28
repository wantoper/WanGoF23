package com.wantoper.GoF12_Proxy;

public class GoF12_Main {
    public static void main(String[] args) {
        Google google = new Google();
        google.google();

        GoogleProxy googleProxy = new GoogleProxy();
        googleProxy.google();
    }
}
