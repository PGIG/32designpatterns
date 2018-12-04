package main.java.xyz.itbest.designpatterns.creational.singleton.five;

/**
 * @author pgig
 * @date 2018/12/4 10:08
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
