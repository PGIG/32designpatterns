package main.java.xyz.itbest.designpatterns.behavioral.observer;

/**
 * @author pgig
 * @date 2018/11/30 16:31
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
