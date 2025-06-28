package com.wantoper.GoF14_Template;

public abstract class WorkTemplate {
    protected abstract void ToWork();
    protected abstract void DoWork();
    protected abstract void LeaveWork();

    public void Start(){
        System.out.println("牛马的一天开始了...");
        ToWork();
        DoWork();
        System.out.println("牛马的一天结束了....");
        LeaveWork();
    }
}
