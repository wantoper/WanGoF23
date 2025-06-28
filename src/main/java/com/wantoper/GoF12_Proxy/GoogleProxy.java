package com.wantoper.GoF12_Proxy;

public class GoogleProxy {
    private Google google;

    public GoogleProxy(){
        try {
            google = (Google) this.getClass().getClassLoader().loadClass("com.wantoper.GoF12_Proxy.Google").newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void google(){
        //模拟设置了某些网络资源
        google.isChina = false;
        google.google();
    }
}
