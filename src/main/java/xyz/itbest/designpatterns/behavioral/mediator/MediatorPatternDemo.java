package main.java.xyz.itbest.designpatterns.behavioral.mediator;

/**
 * @author pgig
 * @date 2018/11/30 16:01
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}