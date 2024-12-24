package iterator;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:01 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        Integer[] items = new Integer[]{1,2,3};
        ShoppingList shoppingList = new ShoppingList(items);
        Iterator iterator = shoppingList.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
