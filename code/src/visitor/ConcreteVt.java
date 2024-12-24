package visitor;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 5:27 PM
 * @description：
 * @modified By：
 */
public class ConcreteVt implements Visitor{
    @Override
    public void getCount(ConcreteAp concreteAp) {
        System.out.println(concreteAp.getCount());
    }
}
