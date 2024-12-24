package builder;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 1:21 PM
 * @description：
 * @modified By：
 */
public class Director {
    public Product productBuild(Builder builder) {
        builder.buildColor();
        builder.buildSize();
        return builder.getProduct();
    }
}
