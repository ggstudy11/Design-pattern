package memento;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:36 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        History history = new History(originator);
        originator.setContent("你好");
        history.save();
        originator.setContent("你不好");
        history.undo();
        String content = originator.getContent();
        System.out.println(content);
    }
}
