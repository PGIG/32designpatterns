package main.java.xyz.itbest.designpatterns.behavioral.visitor;

/**
 * @author pgig
 * @date 2018/12/4 9:26
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
