package main.java.xyz.itbest.designpatterns.behavioral.memento;

import main.java.xyz.itbest.designpatterns.behavioral.memento.Memento;

/**
 * @author pgig
 * @date 2018/11/30 16:19
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}