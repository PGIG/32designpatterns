package main.java.xyz.itbest.designpatterns.creational.singleton.two;

/**
 * @author pgig
 * @date 2018/12/4 9:59
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
