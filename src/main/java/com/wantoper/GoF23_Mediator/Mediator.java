package com.wantoper.GoF23_Mediator;

import com.wantoper.GoF23_Mediator.User;

// 抽象中介者
public interface Mediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
