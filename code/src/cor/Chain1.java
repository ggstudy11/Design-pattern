package cor;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 3:35 PM
 * @description：
 * @modified By：
 */
public class Chain1 implements Chain {
    private Chain next;
    @Override
    public void check(Request request) {
        System.out.println("Chain1 check");
        if (next != null) {
            next.check(request);
        } else{
            System.out.println("done!");
        }
    }

    @Override
    public void setNextChain(Chain chain) {
        next = chain;
    }
}
