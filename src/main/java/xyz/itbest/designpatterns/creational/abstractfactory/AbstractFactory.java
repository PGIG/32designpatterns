package main.java.xyz.itbest.designpatterns.creational.abstractfactory;

/**
 * @author pgig
 * @date 2018/12/4 9:53
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}