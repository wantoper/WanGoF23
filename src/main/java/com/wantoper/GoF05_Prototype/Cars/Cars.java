package com.wantoper.GoF05_Prototype.Cars;

public class Cars implements Prototype {
    private String carName;
    private String attribute;

    public Cars() {}

    public Cars(String attribute) {
        this.attribute = attribute;
    }

    public void loadAttr(){
        //耗时的操作 从数据库获取等等...
        this.attribute = "xxxAttr";
    }

    @Override
    public Cars copy() {
        return new Cars(this.attribute);
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
