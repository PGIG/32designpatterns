package main.java.xyz.itbest.designpatterns.behavioral.observer;

/**
 * @author pgig
 * @date 2018/11/30 16:30
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
