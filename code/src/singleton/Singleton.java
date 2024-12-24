package singleton;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 12:30 PM
 * @description：
 * @modified By：
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}

    // 这里没有考虑多线程并发安全
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    // 考虑并发版本double-check
    public static Singleton getInstance() {
        // 第一层check是为了避免不必要的上锁，假如没有这个判断无论是否需要存在instance，都需要获取锁
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    // 第二层check是防止同步进入后已经被创建了的问题
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
