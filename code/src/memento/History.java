package memento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:25 PM
 * @description：
 * @modified By：
 */
public class History {
    List<Object> list = new LinkedList<>();
    private Originator originator;
    public History(Originator originator) {
        this.originator = originator;
    }
    public void save() {
        list.add(originator.getMemento());
    }
    public void undo() {
        Object memento = list.get(list.size() - 1);
        originator.restore(memento);
    }
}
