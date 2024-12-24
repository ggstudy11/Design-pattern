package iterator;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 3:59 PM
 * @description：
 * @modified By：
 */
public class ItemIterator implements Iterator {
    private Object[] items;
    private int index = 0;
    public ItemIterator(Object[] items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        return index < items.length;
    }

    @Override
    public Object next() {
        return items[index++];
    }
}
