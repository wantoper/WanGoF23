package com.wantoper.GoF07_Bridge;

import com.wantoper.GoF07_Bridge.SystemOs.MacOS;
import com.wantoper.GoF07_Bridge.SystemOs.SystemOS;
import com.wantoper.GoF07_Bridge.SystemOs.WindowsOS;

public class GoF07_Main {
    public static void main(String[] args) {
        SystemOS macOS = new MacOS();
        SystemOS windowsOS = new WindowsOS();
        Computer macComputer = new Computer(macOS);
        Computer winComputer = new Computer(windowsOS);

        macComputer.startup();
        macComputer.getSystemInfo();
        macComputer.shutdown();

        winComputer.startup();
        winComputer.getSystemInfo();
        winComputer.shutdown();
    }
}
