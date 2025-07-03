package com.wantoper.GoF20_Visit;

public class Cat implements Animal {
    public void meow() {
        System.out.println("Cat: 喵喵喵");
    }
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

