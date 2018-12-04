package main.java.xyz.itbest.designpatterns.structural.bridge;

/**
 * @author pgig
 * @date 2018/12/4 10:41
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}