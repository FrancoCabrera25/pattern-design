package com.chat;

import java.util.List;

public interface UserChat {
    public  void send(String msg);
    public  void sendReferenceUser(String msg, List<UserChatImpl> users);
	public  void receive(String msg);
}
