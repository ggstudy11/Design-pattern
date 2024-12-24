package factory;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 1:32 PM
 * @description：
 * @modified By：
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
