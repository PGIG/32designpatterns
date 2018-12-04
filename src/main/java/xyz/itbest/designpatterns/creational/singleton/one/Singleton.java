package main.java.xyz.itbest.designpatterns.creational.singleton.one;

/**
 * @author pgig
 * @date 2018/12/4 9:58
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}