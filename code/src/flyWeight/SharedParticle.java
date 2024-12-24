package flyWeight;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:00 PM
 * @description：
 * @modified By：
 */
public class SharedParticle {
    private String color;
    public SharedParticle(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "SharedParticle [color=" + color + "]";
    }
}
