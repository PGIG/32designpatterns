package main.java.xyz.itbest.designpatterns.structural.flyweight;

import java.util.HashMap;

/**
 * @author pgig
 * @date 2018/12/4 11:07
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}