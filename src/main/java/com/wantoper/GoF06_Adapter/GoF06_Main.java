package com.wantoper.GoF06_Adapter;

import com.wantoper.GoF06_Adapter.Cars.Driver;
import com.wantoper.GoF06_Adapter.Cars.XiaomiCar;
import com.wantoper.GoF06_Adapter.Cars.HauweiCar;

public class GoF06_Main {
    public static void main(String[] args) {
        HauweiCar huaweiCar = new HauweiCar();
        XiaomiCar xiaomiCar = new XiaomiCar();
        Driver xiaomidriver = new Driver(xiaomiCar);
        Driver huaweidriver = new Driver(huaweiCar);

        xiaomidriver.goTo("北京");
        huaweidriver.goTo("上海");
    }
}
