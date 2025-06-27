package com.wantoper.GoF07_Bridge;

import com.wantoper.GoF07_Bridge.SystemOs.SystemOS;

public class Computer {
    private SystemOS os;

    public Computer(SystemOS os){
        this.os = os;
    }

    public void startup(){
        os.startup();
    }

    public void shutdown(){
        os.shutdown();
    }

    public void getSystemInfo(){
        os.info();
    }
}
