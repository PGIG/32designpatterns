package main.java.xyz.itbest.designpatterns.behavioral.visitor;

/**
 * @author pgig
 * @date 2018/12/4 9:22
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}