package decorater;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:38 PM
 * @description：
 * @modified By：
 */
public class Decorater02 extends BaseDecorater{
    public Decorater02(BaseObject baseObject) {
        super(baseObject);
    }

    @Override
    public String getDecoration() {
        return baseObject.getDecoration() + "add something02 ~";
    }
}
