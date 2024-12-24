package builder;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 1:24 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Product product = director.productBuild(concreteBuilder);
        System.out.println(product.toString());
    }
}
