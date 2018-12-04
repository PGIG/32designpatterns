package main.java.xyz.itbest.designpatterns.structural.proxy;

/**
 * @author pgig
 * @date 2018/12/4 11:12
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
