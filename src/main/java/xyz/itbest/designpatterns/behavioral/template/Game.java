package main.java.xyz.itbest.designpatterns.behavioral.template;

/**
 * @author pgig
 * @date 2018/12/4 9:18
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
