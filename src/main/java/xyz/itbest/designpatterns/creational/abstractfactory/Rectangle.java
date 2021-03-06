package main.java.xyz.itbest.designpatterns.creational.abstractfactory;

/**
 * @author pgig
 * @date 2018/12/4 9:50
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
