package state;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:56 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        Television television = new Television();
        television.soundUp();
        television.setState(new State2());
        television.soundDown();
    }
}
