package factory;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 1:33 PM
 * @description：
 * @modified By：
 */
public class ConcreteProduct implements Product{
    @Override
    public void show() {
        System.out.println("ConcreteProduct");
    }
}
