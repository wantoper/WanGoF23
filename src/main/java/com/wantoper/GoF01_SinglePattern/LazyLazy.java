package com.wantoper.GoF01_SinglePattern;

public class LazyLazy {
    private static class LazyLazySingle{
        private static final LazyLazy lazylazy = new LazyLazy();
    }
    private LazyLazy(){}

    public static LazyLazy getInstance(){
        return LazyLazySingle.lazylazy;
    }
}
