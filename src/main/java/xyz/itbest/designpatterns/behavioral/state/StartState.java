package main.java.xyz.itbest.designpatterns.behavioral.state;

/**
 * @author pgig
 * @date 2018/11/30 16:35
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start State";
    }
}
