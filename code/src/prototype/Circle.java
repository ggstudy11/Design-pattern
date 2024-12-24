package prototype;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 12:57 PM
 * @description：
 * @modified By：
 */
public class Circle extends Shape {
    public int radius;

    public Circle() {}

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    // 父类元素比较再进行子类元素比较
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
