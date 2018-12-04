package main.java.xyz.itbest.designpatterns.creational.abstractfactory;

/**
 * @author pgig
 * @date 2018/12/4 9:55
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}