package main.java.xyz.itbest.designpatterns.behavioral.interpreter;

/**
 * @author pgig
 * @date 2018/11/30 15:19
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}