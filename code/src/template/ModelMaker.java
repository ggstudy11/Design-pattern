package template;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 5:13 PM
 * @description：
 * @modified By：
 */
public abstract class ModelMaker {
    public final void make() {
        process1();
        process2();
        process3();
        process4();
    }
    public abstract void process1();
    public abstract void process2();
    public abstract void process3();
    public void process4() {
        System.out.println("结束！");
    }
}
