package main.java.xyz.itbest.designpatterns.creational.singleton.three;

/**
 * @author pgig
 * @date 2018/12/4 10:10
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}