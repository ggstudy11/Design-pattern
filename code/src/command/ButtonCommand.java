package command;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 3:54 PM
 * @description：
 * @modified By：
 */
public class ButtonCommand implements Command {
    private Button button;
    public ButtonCommand(Button button) {
        this.button = button;
    }
    @Override
    public void execute() {
        button.on();
        button.off();
    }
}
