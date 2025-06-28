package com.wantoper.GoF13_Chain;

public class ErrorLog extends Logger{
    @Override
    public void Log(int level) {
        System.out.println("Error来输出...");
    }
}
