package decorater;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:34 PM
 * @description：
 * @modified By：
 */
public class Decorater01 extends BaseDecorater {
    public Decorater01(BaseObject baseObject) {
        super(baseObject);
    }

    @Override
    public String getDecoration() {
        return baseObject.getDecoration() + "add something 01 ~";
    }
}
