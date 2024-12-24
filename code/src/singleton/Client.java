package singleton;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 12:31 PM
 * @description：
 * @modified By：
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---单例模式测试---");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2? "得到的是同一对象":"得到的不是同一对象");
        System.out.println("---单例模式测试结束---");
        System.out.println();
        System.out.println("---非单例模式测试---");
        AntiSingleton a1 = new AntiSingleton();
        AntiSingleton a2 = new AntiSingleton();
        System.out.println(a1 == a2?"得到的是同一个对象":"得到的不是同一对象");
        System.out.println("---非单例模式测试---");
    }
}
