package com.chat;

import java.util.List;

public class UserChatImpl extends User implements UserChat {

    private ChatMediator mediator;

    public UserChatImpl() {
    }

    public UserChatImpl(String name, ChatMediator mediator) {
        super(name);
        this.mediator = mediator;
    }

    @Override
    public void send(String msg) {
        System.out.println("--------------------");
        System.out.println(this.name + ": Sending Message=" + msg);
        this.mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message:" + msg);
    }

    @Override
    public void sendReferenceUser(String msg, List<UserChatImpl> users) {
        String parseMsg = "";
        for (UserChatImpl user : users) {
            parseMsg += "@" + user.getName();
        }
        parseMsg = parseMsg + "  " + msg;
        System.out.println("--------------------");
        System.out.println(this.name + ": Sending Message=" + msg);
        this.mediator.sendMessage(parseMsg, this);
    }

    // @Override
    // public void sendReferenceUser(String msg,List<UserChatImpl> users) {
    // // System.out.println(this.name + ": Sending Message=" + msg);

    // // String parseMsg = "@" + user.getName() + " " + msg;
    // // this.mediator.sendMessage(parseMsg, this);
    // }
}
