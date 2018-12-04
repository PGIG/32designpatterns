package main.java.xyz.itbest.designpatterns.behavioral.memento;

/**
 * @author pgig
 * @date 2018/11/30 16:17
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
