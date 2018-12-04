package main.java.xyz.itbest.designpatterns.structural.facade;

/**
 * @author pgig
 * @date 2018/12/4 11:04
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
