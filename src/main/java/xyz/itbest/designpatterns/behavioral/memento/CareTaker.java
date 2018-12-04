package main.java.xyz.itbest.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pgig
 * @date 2018/11/30 16:20
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
