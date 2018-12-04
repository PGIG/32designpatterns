package main.java.xyz.itbest.designpatterns.creational.singleton.four;

/**
 * @author pgig
 * @date 2018/12/4 10:10
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
