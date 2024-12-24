package bridge;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:55 PM
 * @description：
 * @modified By：
 */
public abstract class Shape {
    protected DrawMethod drawMethod;
    protected Shape(DrawMethod drawMethod) {
        this.drawMethod = drawMethod;
    }
    public abstract void draw();
}
