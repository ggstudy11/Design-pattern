package iterator;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:00 PM
 * @description：
 * @modified By：
 */
public class ShoppingList {
    private Object[] list;

    public ShoppingList(Object[] list) {
        this.list = list;
    }

    public Iterator getIterator() {
        return new ItemIterator(list);
    }
}
