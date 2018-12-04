package main.java.xyz.itbest.designpatterns.creational.builder;

/**
 * @author pgig
 * @date 2018/12/4 10:22
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
