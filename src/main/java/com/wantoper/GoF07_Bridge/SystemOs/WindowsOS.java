package com.wantoper.GoF07_Bridge.SystemOs;

public class WindowsOS extends SystemOS{
    @Override
    public void shutdown() {
        System.out.println("WindowsOS Shutdown...");
    }

    @Override
    public void startup() {
        System.out.println("WindowsOS Startup...");
    }

    @Override
    public void info() {
        System.out.println("WindowsOS v11");
    }
}
