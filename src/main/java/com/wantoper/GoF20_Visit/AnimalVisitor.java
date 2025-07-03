package com.wantoper.GoF20_Visit;

public interface AnimalVisitor {
    void visit(Dog dog);
    void visit(Cat cat);
}

