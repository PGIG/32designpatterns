package main.java.xyz.itbest.designpatterns.creational.prototype;

/**
 * @author pgig
 * @date 2018/12/4 10:32
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
