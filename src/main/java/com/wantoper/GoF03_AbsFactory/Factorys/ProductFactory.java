package com.wantoper.GoF03_AbsFactory.Factorys;

import com.wantoper.GoF03_AbsFactory.Products.Car;
import com.wantoper.GoF03_AbsFactory.Products.Pad;

public interface ProductFactory {
    Car getCar();
    Pad getPad();
}
