package com.wantoper.GoF04_Builder.Cars;

public class XiaomiCarBuilder extends CarBuilder{
    private Car xiaoMiCar = new Car();

    public XiaomiCarBuilder(){
        xiaoMiCar.setCarName("xiaomi");
    }

    @Override
    public XiaomiCarBuilder setTyreColor(String color) {
        xiaoMiCar.setTyreColor(color);
        return this;
    }

    @Override
    public XiaomiCarBuilder setCarColor(String color) {
        xiaoMiCar.setCarColor(color);
        return this;
    }

    @Override
    public XiaomiCarBuilder setLight(String light) {
        xiaoMiCar.setLight(light);
        return this;
    }

    @Override
    public Car Build() {
        return xiaoMiCar;
    }
}
