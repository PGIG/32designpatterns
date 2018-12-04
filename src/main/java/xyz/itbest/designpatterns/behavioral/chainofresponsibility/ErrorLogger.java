package main.java.xyz.itbest.designpatterns.behavioral.chainofresponsibility;

/**
 * @author pgig
 * @date 2018/11/30 11:29
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}