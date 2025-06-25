package com.wantoper.GoF03_AbsFactory.Factorys;

import com.wantoper.GoF03_AbsFactory.Products.Car;
import com.wantoper.GoF03_AbsFactory.Products.HuaWei.HuaweiCar;
import com.wantoper.GoF03_AbsFactory.Products.HuaWei.HuaweiPad;
import com.wantoper.GoF03_AbsFactory.Products.Pad;

public class HuaweiFactory implements ProductFactory{

    @Override
    public Car getCar() {
        return new HuaweiCar();
    }

    @Override
    public Pad getPad() {
        return new HuaweiPad();
    }
}
