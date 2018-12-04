package main.java.xyz.itbest.designpatterns.behavioral.command;

/**
 * @author pgig
 * @date 2018/11/30 14:20
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}