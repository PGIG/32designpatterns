package main.java.xyz.itbest.designpatterns.behavioral.observer;

/**
 * @author pgig
 * @date 2018/11/30 16:31
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
