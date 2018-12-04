package main.java.xyz.itbest.designpatterns.behavioral.nullobject;

/**
 * @author pgig
 * @date 2018/11/30 16:51
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
