package main.java.xyz.itbest.designpatterns.creational.prototype;

/**
 * @author pgig
 * @date 2018/12/4 10:31
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}