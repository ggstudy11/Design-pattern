package prototype;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 12:54 PM
 * @description：
 * @modified By：
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {}

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    // 克隆接口
    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && shape2.color.equals(color);
    }
}
