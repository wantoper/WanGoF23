package com.wantoper.GoF02_Factory;

public class SimpleFactory {

    /*
    * 简单工厂方法1
    * */
    public static CarsObject getCars(String name){
        if (name.equals("wuling")) {
            return new Wuling();
        }else if (name.equals("Tesla")){
            return new Tesla();
        }else {
            return null;
        }
    }

    /*
     * 简单工厂方法2
     * */
    public static CarsObject getWuling(){
        return new Wuling();
    }

    public static CarsObject getTesla(){
        return new Tesla();
    }
}