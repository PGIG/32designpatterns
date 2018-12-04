package main.java.xyz.itbest.designpatterns.creational.builder;

/**
 * @author pgig
 * @date 2018/12/4 10:25
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
