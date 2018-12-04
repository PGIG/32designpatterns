package main.java.xyz.itbest.designpatterns.behavioral.visitor;

/**
 * @author pgig
 * @date 2018/12/4 9:24
 */
public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
