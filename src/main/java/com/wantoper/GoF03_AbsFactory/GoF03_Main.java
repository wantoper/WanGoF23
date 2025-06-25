package com.wantoper.GoF03_AbsFactory;

import com.wantoper.GoF03_AbsFactory.Factorys.HuaweiFactory;
import com.wantoper.GoF03_AbsFactory.Factorys.ProductFactory;
import com.wantoper.GoF03_AbsFactory.Factorys.XiaomiFactory;
import com.wantoper.GoF03_AbsFactory.Products.Car;
import com.wantoper.GoF03_AbsFactory.Products.Pad;

public class GoF03_Main {
    public static void main(String[] args) {
        ProductFactory huaweiFactory = new HuaweiFactory();
        Car huaweicar = huaweiFactory.getCar();
        Pad huaweipad = huaweiFactory.getPad();

        ProductFactory xiaomiFactory = new XiaomiFactory();
        Car xiaomicar = xiaomiFactory.getCar();
        Pad xiaomipad = xiaomiFactory.getPad();
    }
}
