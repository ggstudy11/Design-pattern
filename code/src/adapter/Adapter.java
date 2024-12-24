package adapter;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 1:47 PM
 * @description：
 * @modified By：
 */
public class Adapter implements TargetInterface{
    private OriginObject originObject;
    public Adapter(OriginObject originObject) {
        this.originObject = originObject;
    }
    @Override
    public void show() {
        originObject.sing();
    }

    @Override
    public void display() {
        originObject.dance();
    }
}
