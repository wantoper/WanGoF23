package com.wantoper.GoF20_Visit;

public class GoF20_Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        AnimalVisitor feedVisitor = new FeedVisitor();
        AnimalVisitor washVisitor = new WashVisitor();

        dog.accept(feedVisitor); // 给狗喂食
        cat.accept(feedVisitor); // 给猫喂食
        dog.accept(washVisitor); // 给狗洗澡
        cat.accept(washVisitor); // 给猫洗澡
    }
}
