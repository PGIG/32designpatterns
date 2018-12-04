package main.java.xyz.itbest.designpatterns.structural.adapter;

/**
 * @author pgig
 * @date 2018/12/4 10:37
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}