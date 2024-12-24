package observer;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:52 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSb concreteSb = new ConcreteSb();
        concreteSb.addObserver(new ConcreteOb("red"));
        concreteSb.addObserver(new ConcreteOb("blue"));
        concreteSb.addObserver(new ConcreteOb("green"));
        concreteSb.notifyObservers();
    }
}
