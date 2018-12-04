package main.java.xyz.itbest.designpatterns.creational.abstractfactory;

/**
 * @author pgig
 * @date 2018/12/4 9:52
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
