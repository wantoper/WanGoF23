package com.wantoper.GoF12_Proxy;

public class Google {
    boolean isChina = true;

    public void google(){
        if (isChina){
            System.out.println("哎呀 网络不可达...");
        }else{
            System.out.println("搜索成功了....");
        }
    }
}
