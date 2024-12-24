package factory;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 1:29 PM
 * @description：
 * @modified By：
 */
public class client {
    public static void main(String[] args) {
        // 这里工厂模式的作用不是很明显
        // 工厂模式的流程：
        // 1. 实现Product通用接口
        // 2. 实现Factory通用接口
        // 3. 当一个工厂需要生成多种Product时，这时优势才会体现
        Factory concreteFactory = new ConcreteFactory();
        ConcreteProduct product = (ConcreteProduct)concreteFactory.createProduct();
        product.show();
    }
}
