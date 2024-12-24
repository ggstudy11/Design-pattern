package decorater;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:38 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        ConcreteObject obj = new ConcreteObject();
        Decorater01 decorater01 = new Decorater01(obj);
        Decorater02 decorater02 = new Decorater02(decorater01);
        System.out.println(decorater02.getDecoration());
    }
}
