package main.java.xyz.itbest.designpatterns.creational.builder;

/**
 * @author pgig
 * @date 2018/12/4 10:24
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}