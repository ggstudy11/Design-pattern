package composite;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:24 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        Object object = new Object();
        Box box = new Box();
        box.add(object);
        box.add(new Object());
        Box box1 = new Box();
        box1.add(object);
        box1.add(new Object());
        box.add(box1);
        box.print();
    }
}
