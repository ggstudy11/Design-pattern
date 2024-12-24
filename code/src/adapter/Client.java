package adapter;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 1:49 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        OriginObject originObject = new OriginObject();
        Adapter adapter = new Adapter(originObject);
        adapter.display();
        adapter.show();
    }
}
