package facade;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:14 PM
 * @description：
 * @modified By：
 */
public class ConcreteVideo implements Video {
    @Override
    public void on() {
        System.out.println("ConcreteVideo is on");
    }

    @Override
    public void soundUp() {
        System.out.println("ConcreteVideo is sound up");
    }

    @Override
    public void display() {
        System.out.println("ConcreteVideo is display");
    }
}
