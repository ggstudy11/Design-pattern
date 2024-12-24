package bridge;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:58 PM
 * @description：
 * @modified By：
 */
public class Circle extends Shape {
    protected Circle(DrawMethod drawMethod) {
        super(drawMethod);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        drawMethod.draw();
    }
}
