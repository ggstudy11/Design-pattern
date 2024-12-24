package cor;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 3:41 PM
 * @description：
 * @modified By：
 */
public class Chain2 implements Chain {
    private Chain next;
    @Override
    public void check(Request request) {
        System.out.println("Chain2 check");
        if (next != null) {
            next.check(request);
        } else {
            System.out.println("done!");
        }
    }

    @Override
    public void setNextChain(Chain chain) {
        next = chain;
    }
}
