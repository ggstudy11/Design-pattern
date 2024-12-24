package visitor;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 5:29 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        ConcreteVt concreteVt = new ConcreteVt();
        ConcreteAp concreteAp = new ConcreteAp();
        concreteAp.accept(concreteVt);
    }
}
