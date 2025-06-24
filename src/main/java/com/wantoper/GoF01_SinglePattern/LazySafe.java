package com.wantoper.GoF01_SinglePattern;

public class LazySafe {
    private LazySafe(){}

    private static LazySafe lazySafe;

    public static synchronized LazySafe getInstance(){
        if(lazySafe == null){
            lazySafe = new LazySafe();
        }
        return lazySafe;
    }

    //volatile 原子性
    private volatile static LazySafe lazySafe1;
    public static synchronized LazySafe getInstance1(){
        if (lazySafe1 == null){
            synchronized (LazySafe.class){
                if (lazySafe1 == null){
                    lazySafe1 = new LazySafe();
                }
            }
        }
        return lazySafe1;
    }
}
