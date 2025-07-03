package com.wantoper.GoF20_Visit;

public class Dog implements Animal {
    public void bark() {
        System.out.println("Dog: 汪汪汪");
    }
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

