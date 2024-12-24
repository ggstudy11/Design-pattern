package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:09 PM
 * @description：
 * @modified By：
 */
public class ConcreteMediator implements Mediator {
    private List<User> users = new ArrayList<>();
    @Override
    public void sendMessage(String message) {
        for (User user : users) {
            user.receive(message);
        }
    }
    public void addUser(User user) {
        users.add(user);
    }
}
