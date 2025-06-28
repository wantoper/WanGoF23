package com.wantoper.GoF13_Chain;

public class GoF13_Main {
    public static void main(String[] args) {
        ErrorLog errorLog = new ErrorLog();
        DebugLog debugLog = new DebugLog();
        debugLog.setNext(errorLog);
        debugLog.Log(1);
        debugLog.Log(2);
    }
}
