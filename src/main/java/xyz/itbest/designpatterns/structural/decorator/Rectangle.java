package main.java.xyz.itbest.designpatterns.structural.decorator;

/**
 * @author pgig
 * @date 2018/12/4 10:51
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
