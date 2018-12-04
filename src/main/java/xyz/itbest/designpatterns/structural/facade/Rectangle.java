package main.java.xyz.itbest.designpatterns.structural.facade;

/**
 * @author pgig
 * @date 2018/12/4 10:57
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}