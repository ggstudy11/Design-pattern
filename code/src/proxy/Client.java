package proxy;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:50 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        RealReader reader = new RealReader();
        ProxyReader proxyReader = new ProxyReader(reader);
        proxyReader.readFile("file01");
        proxyReader.getFileLength();
    }
}
