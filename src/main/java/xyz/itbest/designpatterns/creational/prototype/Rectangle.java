package main.java.xyz.itbest.designpatterns.creational.prototype;

/**
 * @author pgig
 * @date 2018/12/4 10:31
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
