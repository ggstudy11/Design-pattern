package prototype;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 12:59 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        Circle cloned = (Circle) circle.clone();
        System.out.println(circle == cloned? "是同一个对象":"不是同一个对象");
        System.out.println(circle.equals(cloned));
        System.out.println(circle instanceof Circle);
        System.out.println(circle instanceof Shape);
    }
}
