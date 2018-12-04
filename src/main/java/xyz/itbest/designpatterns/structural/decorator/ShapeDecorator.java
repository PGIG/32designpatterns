package main.java.xyz.itbest.designpatterns.structural.decorator;

/**
 * @author pgig
 * @date 2018/12/4 10:51
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
