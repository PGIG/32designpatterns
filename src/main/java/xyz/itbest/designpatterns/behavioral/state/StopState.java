package main.java.xyz.itbest.designpatterns.behavioral.state;

/**
 * @author pgig
 * @date 2018/11/30 16:36
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Stop State";
    }
}
