package composite;

import java.util.*;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:19 PM
 * @description：
 * @modified By：
 */
public class Box implements Node {
    private List<Node> list = new ArrayList<>();
    @Override
    public void print() {
        for (Node n : list) {
            n.print();
        }
    }
    public void add(Node n) {
        list.add(n);
    }
    public void remove(Node n) {
        list.remove(n);
    }
}
