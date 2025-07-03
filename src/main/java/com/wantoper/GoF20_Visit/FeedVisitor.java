package com.wantoper.GoF20_Visit;

public class FeedVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("给狗喂狗粮");
    }
    @Override
    public void visit(Cat cat) {
        System.out.println("给猫喂猫粮");
    }
}

