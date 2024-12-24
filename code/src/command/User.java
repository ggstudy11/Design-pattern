package command;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 3:55 PM
 * @description：
 * @modified By：
 */
public class User {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void execute() {
        command.execute();
    }
}
