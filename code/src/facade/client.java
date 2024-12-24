package facade;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:16 PM
 * @description：
 * @modified By：
 */
public class client {
    public static void main(String[] args) {
        ConcreteVideo concreteVideo = new ConcreteVideo();
        Facade facade = new Facade(concreteVideo);
        facade.watchTv();
    }
}
