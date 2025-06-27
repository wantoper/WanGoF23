package com.wantoper.GoF05_Prototype;

import com.wantoper.GoF05_Prototype.Cars.Cars;

public class GoF05_Main {
    public static void main(String[] args) {
        Cars xiaomiSu7 = new Cars();
        xiaomiSu7.setCarName("XiaoMiSu7");
        xiaomiSu7.loadAttr();

        Cars xiaomiYu7 = xiaomiSu7.copy();
        xiaomiYu7.setCarName("XiaoMiYu7");
    }
}
