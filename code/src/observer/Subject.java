package observer;



/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:46 PM
 * @description：
 * @modified By：
 */
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
