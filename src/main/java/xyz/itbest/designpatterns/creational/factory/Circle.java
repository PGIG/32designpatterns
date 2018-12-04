package main.java.xyz.itbest.designpatterns.creational.factory;

/**
 * @author pgig
 * @date 2018/12/4 9:48
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
