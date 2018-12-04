package main.java.xyz.itbest.designpatterns.structural.bridge;

/**
 * @author pgig
 * @date 2018/12/4 10:39
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}