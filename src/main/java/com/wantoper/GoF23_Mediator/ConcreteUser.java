package com.wantoper.GoF23_Mediator;

// 具体同事类
public class ConcreteUser extends User {
    public ConcreteUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " 发送消息: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message, String from) {
        System.out.println(this.name + " 收到来自 " + from + " 的消息: " + message);
    }
}

