package state;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 5:01 PM
 * @description：
 * @modified By：
 */
public class Television {
    private State state;
    public Television() {
        this.state = new State1();
    }
    public void setState(State state) {
        this.state = state;
    }
    public void on() {
        state.on();
    }
    public void off() {
        state.off();
    }
    public void soundUp() {
        state.soundUp();
    }
    public void soundDown() {
        state.soundDown();
    }
}
