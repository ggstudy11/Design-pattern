package bridge;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:59 PM
 * @description：
 * @modified By：
 */
public class Rectangle extends Shape {
    protected Rectangle(DrawMethod drawMethod) {
        super(drawMethod);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
        drawMethod.draw();
    }
}
