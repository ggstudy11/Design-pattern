package mediator;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:11 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        User user = new User("red", concreteMediator);
        User user2 = new User("blue", concreteMediator);
        concreteMediator.addUser(user);
        concreteMediator.addUser(user2);
        user.send("hello!");
    }
}
