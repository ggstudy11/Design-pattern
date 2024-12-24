package cor;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 3:04 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request();
        ChainFilter chainFilter = new ChainFilter(request);
        chainFilter.doFilter(new Chain1(), new Chain2());
    }
}
