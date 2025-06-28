package com.wantoper.GoF11_Strategy;

public class GoF11_Main {
    public static void main(String[] args) {
        goToEat(new HLSDinner());
        goToEat(new KFCDinner());
    }

    public static void goToEat(Dinner dinner){
        dinner.dine();
    }
}
