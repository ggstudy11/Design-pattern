package strategy;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 5:08 PM
 * @description：
 * @modified By：
 */
public class Activity {
    private Strategy strategy;
    public Activity(Strategy strategy) {
        this.strategy = strategy;
    }
    public void display() {
        System.out.println("活动开始了！");
        strategy.strategy();
    }
}
