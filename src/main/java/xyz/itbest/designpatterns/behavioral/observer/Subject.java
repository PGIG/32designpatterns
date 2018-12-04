package main.java.xyz.itbest.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pgig
 * @date 2018/11/30 16:29
 */
public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
