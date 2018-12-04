package main.java.xyz.itbest.designpatterns.behavioral.nullobject;

/**
 * @author pgig
 * @date 2018/11/30 17:02
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
