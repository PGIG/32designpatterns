package main.java.xyz.itbest.designpatterns.behavioral.visitor;

/**
 * @author pgig
 * @date 2018/12/4 9:22
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
