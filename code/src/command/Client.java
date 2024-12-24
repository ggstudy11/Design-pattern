package command;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 3:48 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        ButtonCommand buttonCommand = new ButtonCommand(new Button());
        User user = new User();
        user.setCommand(buttonCommand);
        user.execute();
    }
}
