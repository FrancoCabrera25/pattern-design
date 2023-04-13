package com.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<UserChatImpl> users;

    public List<UserChatImpl> getUsers() {
        return users;
    }

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, UserChatImpl user) {
        for (UserChatImpl userChat : this.users) {
            if (userChat != user) {
                userChat.receive(msg);
            }
        }
    }

    @Override
    public void addUser(UserChatImpl user) {
        this.users.add(user);
    }

}
