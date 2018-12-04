package main.java.xyz.itbest.designpatterns.creational.builder;

/**
 * @author pgig
 * @date 2018/12/4 10:24
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}