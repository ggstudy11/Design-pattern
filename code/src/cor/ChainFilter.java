package cor;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 3:43 PM
 * @description：
 * @modified By：
 */
public class ChainFilter {
    private Request request;
    private Chain[] chains;
    public ChainFilter(Request request) {
        this.request = request;
    }
    public void doFilter(Chain ...chains) {
        chains = chains;
        for (int i = 0; i < chains.length - 1; i++) {
            chains[i].setNextChain(chains[i + 1]);
        }
        chains[0].check(request);
    }
}
