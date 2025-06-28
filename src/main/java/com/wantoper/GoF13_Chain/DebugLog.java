package com.wantoper.GoF13_Chain;

public class DebugLog extends Logger {
    @Override
    public void Log(int level) {
        if (level>1){
            this.next.Log(level);
        }else{
            System.out.println("Debug来输出");
        }
    }
}
