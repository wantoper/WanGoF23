package com.wantoper.GoF06_Adapter;

import com.wantoper.GoF06_Adapter.Cars.Driver;
import com.wantoper.GoF06_Adapter.Cars.XiaomiCar;
import com.wantoper.GoF06_Adapter.Cars.HauweiCar;

public class GoF06_Main {
    public static void main(String[] args) {
        HauweiCar huaweiCar = new HauweiCar();
        XiaomiCar xiaomiCar = new XiaomiCar();
        Driver driver = new Driver();

        driver.goTo(huaweiCar,"北京");
        driver.goTo(xiaomiCar,"上海");

    }
}
