package com.wantoper.GoF23_Mediator;

public class GoF23_Main {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();
        User user1 = new ConcreteUser(mediator, "张三");
        User user2 = new ConcreteUser(mediator, "李四");
        User user3 = new ConcreteUser(mediator, "王五");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("大家好，我是张三！");
        user2.send("欢迎张三！");
    }
}
