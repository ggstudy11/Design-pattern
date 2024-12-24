package mediator;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:08 PM
 * @description：
 * @modified By：
 */
public class User {
    private String name;
    private Mediator mediator;
    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    public void receive(String message) {
        System.out.println(name + "接受到" + message);
    }
    public void send(String message) {
        mediator.sendMessage(message);
    }
}
