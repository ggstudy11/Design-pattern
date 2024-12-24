package cor;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 3:35 PM
 * @description：
 * @modified By：
 */
public interface Chain {
    void check(Request request);
    void setNextChain(Chain chain);
}
