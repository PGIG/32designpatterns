package main.java.xyz.itbest.designpatterns.behavioral.Iterator;

/**
 * @author pgig
 * @date 2018/11/30 15:54
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}