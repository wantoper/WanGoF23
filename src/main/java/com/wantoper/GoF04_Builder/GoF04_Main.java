package com.wantoper.GoF04_Builder;

import com.wantoper.GoF04_Builder.Cars.Car;
import com.wantoper.GoF04_Builder.Cars.XiaomiCarBuilder;

public class GoF04_Main {
    public static void main(String[] args) {
        Car xiaomicar = new XiaomiCarBuilder()
                .setCarColor("Green")
                .setTyreColor("Black")
                .setLight("White")
                .Build();
    }
}
