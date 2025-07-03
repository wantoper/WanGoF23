package com.wantoper.GoF23_Mediator;

import java.util.ArrayList;
import java.util.List;
import com.wantoper.GoF23_Mediator.User;

// 具体中介者
public class ChatMediator implements Mediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message, user.getName());
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
