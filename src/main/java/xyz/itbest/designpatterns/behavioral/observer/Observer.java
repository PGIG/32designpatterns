package main.java.xyz.itbest.designpatterns.behavioral.observer;

/**
 * @author pgig
 * @date 2018/11/30 16:30
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}