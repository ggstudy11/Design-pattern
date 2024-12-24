package state;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 5:00 PM
 * @description：
 * @modified By：
 */
public class State2 implements State {
    @Override
    public void soundUp() {
        System.out.println("调大音量...");
    }

    @Override
    public void soundDown() {
        System.out.println("调小音量...");
    }

    @Override
    public void on() {
        System.out.println("已开机...");
    }

    @Override
    public void off() {
        System.out.println("关机中...");
    }
}
