package decorater;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:33 PM
 * @description：
 * @modified By：
 */
public abstract class BaseDecorater implements BaseObject{
    protected BaseObject baseObject;
    public BaseDecorater(BaseObject baseObject) {
        this.baseObject = baseObject;
    }
}
