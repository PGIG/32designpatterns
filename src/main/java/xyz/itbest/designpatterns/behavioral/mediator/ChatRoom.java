package main.java.xyz.itbest.designpatterns.behavioral.mediator;

import java.util.Date;

/**
 * @author pgig
 * @date 2018/11/30 15:56
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}