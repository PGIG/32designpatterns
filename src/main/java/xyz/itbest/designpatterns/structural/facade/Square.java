package main.java.xyz.itbest.designpatterns.structural.facade;

/**
 * @author pgig
 * @date 2018/12/4 11:04
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}