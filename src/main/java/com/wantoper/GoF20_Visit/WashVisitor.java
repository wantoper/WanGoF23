package com.wantoper.GoF20_Visit;

public class WashVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("给狗洗澡");
    }
    @Override
    public void visit(Cat cat) {
        System.out.println("给猫洗澡");
    }
}

