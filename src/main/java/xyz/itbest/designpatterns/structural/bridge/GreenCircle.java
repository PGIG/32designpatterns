package main.java.xyz.itbest.designpatterns.structural.bridge;

/**
 * @author pgig
 * @date 2018/12/4 10:40
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}