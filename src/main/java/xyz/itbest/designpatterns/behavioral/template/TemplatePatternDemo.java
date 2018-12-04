package main.java.xyz.itbest.designpatterns.behavioral.template;

/**
 * @author pgig
 * @date 2018/12/4 9:20
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}