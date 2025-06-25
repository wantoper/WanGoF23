package com.wantoper.GoF04_Builder.Cars;

public abstract class CarBuilder {
    abstract CarBuilder setTyreColor(String color);
    abstract CarBuilder setCarColor(String color);
    abstract CarBuilder setLight(String light);
    abstract Car Build();
}
