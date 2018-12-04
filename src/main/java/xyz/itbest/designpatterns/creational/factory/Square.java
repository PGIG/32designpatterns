package main.java.xyz.itbest.designpatterns.creational.factory;

/**
 * @author pgig
 * @date 2018/12/4 9:47
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}