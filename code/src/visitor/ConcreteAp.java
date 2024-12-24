package visitor;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 5:24 PM
 * @description：
 * @modified By：
 */
public class ConcreteAp implements Accepter {
    private int count = 1;
    public int getCount() {
        return count;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.getCount(this);
    }
}
