package strategy;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 5:06 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        Strategy1 strategy1 = new Strategy1();
        Activity activity = new Activity(strategy1);
        activity.display();
    }
}
