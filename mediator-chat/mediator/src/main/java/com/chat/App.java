package com.chat;
import java.util.ArrayList;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        List<UserChatImpl> userReference = new ArrayList<>();
        UserChatImpl user1 = new UserChatImpl("Franco", mediator);
        UserChatImpl user2 = new UserChatImpl("Juan", mediator);
        UserChatImpl user3 = new UserChatImpl("Luciana", mediator);
        UserChatImpl user4 = new UserChatImpl("Pedro", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
         
        user1.send("Hola Grupo, buen dia!!!");
        userReference.add(user1);
        user2.sendReferenceUser("Buen dia, como estas?", userReference );
        userReference.clear();
        userReference.add(user1);
        userReference.add(user2);
        user3.sendReferenceUser("Buen dia, como estas?", userReference );;

    }
}
