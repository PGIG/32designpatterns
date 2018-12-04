package main.java.xyz.itbest.designpatterns.behavioral.state;

/**
 * @author pgig
 * @date 2018/11/30 16:33
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
