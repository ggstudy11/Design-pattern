package bridge;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 3:01 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new DrawByColor());
        rectangle.draw();
        Circle circle = new Circle(new DrawByColor());
        circle.draw();
        Rectangle rectangle2 = new Rectangle(new DrawBySize());
        rectangle2.draw();
    }
}
