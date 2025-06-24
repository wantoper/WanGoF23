package com.wantoper.GoF01_SinglePattern;

public class LazyInSafe {
    private LazyInSafe(){}

    private static LazyInSafe lazyInSafe;

    public static LazyInSafe getInstance(){
        if(lazyInSafe == null){
            lazyInSafe = new LazyInSafe();
        }
        return lazyInSafe;
    }
}
