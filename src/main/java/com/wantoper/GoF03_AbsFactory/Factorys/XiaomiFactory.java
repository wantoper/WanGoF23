package com.wantoper.GoF03_AbsFactory.Factorys;

import com.wantoper.GoF03_AbsFactory.Products.Car;
import com.wantoper.GoF03_AbsFactory.Products.Pad;
import com.wantoper.GoF03_AbsFactory.Products.XiaoMi.XiaomiCar;
import com.wantoper.GoF03_AbsFactory.Products.XiaoMi.XiaomiPad;

public class XiaomiFactory implements ProductFactory{
    @Override
    public Car getCar() {
        return new XiaomiCar();
    }

    @Override
    public Pad getPad() {
        return new XiaomiPad();
    }
}
