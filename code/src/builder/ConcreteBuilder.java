package builder;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 1:20 PM
 * @description：
 * @modified By：
 */
public class ConcreteBuilder implements Builder {
    private Product product = new Product();
    @Override
    public void buildColor() {
        product.setColor("red");
    }

    @Override
    public void buildSize() {
        product.setSize(5);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
