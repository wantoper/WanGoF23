package com.wantoper.GoF14_Template;

public class walkWrok extends WorkTemplate{
    @Override
    protected void ToWork() {
        System.out.println("走路去上班...");
    }

    @Override
    protected void DoWork() {
        System.out.println("今天摸鱼");
    }

    @Override
    protected void LeaveWork() {
        System.out.println("走路离开公司...");
    }
}
