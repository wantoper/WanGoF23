package com.wantoper.GoF07_Bridge.SystemOs;

public class MacOS extends SystemOS{

    @Override
    public void shutdown() {
        System.out.println("MacOS Shutdown...");
    }

    @Override
    public void startup() {
        System.out.println("Macos Startup...");
    }

    @Override
    public void info() {
        System.out.println("Macos v0.0.1");
    }
}
