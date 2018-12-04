package main.java.xyz.itbest.designpatterns.structural.adapter;

/**
 * @author pgig
 * @date 2018/12/4 10:38
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
