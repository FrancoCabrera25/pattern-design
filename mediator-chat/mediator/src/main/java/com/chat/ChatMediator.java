package com.chat;

public interface ChatMediator {
    void sendMessage(String msg, UserChatImpl user);
    void addUser(UserChatImpl user);
}
