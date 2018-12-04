package main.java.xyz.itbest.designpatterns.behavioral.command;

/**
 * @author pgig
 * @date 2018/11/30 14:21
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}