package main.java.xyz.itbest.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pgig
 * @date 2018/11/30 14:49
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
