package main.java.xyz.itbest.designpatterns.structural.bridge;

/**
 * @author pgig
 * @date 2018/12/4 10:40
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
