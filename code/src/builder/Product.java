package builder;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 1:17 PM
 * @description：
 * @modified By：
 */
public class Product {
    private String color;
    private int size;

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product [color=" + color + ", size=" + size + "]";
    }

}
