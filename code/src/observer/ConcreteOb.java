package observer;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:48 PM
 * @description：
 * @modified By：
 */
public class ConcreteOb implements Observer {
    private Integer stock = 0;
    private String name;
    public ConcreteOb(String name) {
        this.name = name;
    }
    @Override
    public void update() {
        stock += 1;
        System.out.println(name + " is now " + stock);
    }
}
