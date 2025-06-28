package com.wantoper.GoF13_Chain;

public abstract class Logger {
    protected Logger next;
    public void setNext(Logger next){
        this.next = next;
    }
    public abstract void Log(int level);
}
