package observer;

import java.util.*;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 4:49 PM
 * @description：
 * @modified By：
 */
public class ConcreteSb implements Subject {
    List<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
