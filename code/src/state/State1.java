package state;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:57 PM
 * @description：
 * @modified By：
 */
public class State1 implements State {
    @Override
    public void soundUp() {
        System.out.println("关机中...无法调大音量");
    }

    @Override
    public void soundDown() {
        System.out.println("关机中...无法调小音量");
    }

    @Override
    public void on() {
        System.out.println("开机...");
    }

    @Override
    public void off() {
        System.out.println("已关机...无法关机");
    }
}
