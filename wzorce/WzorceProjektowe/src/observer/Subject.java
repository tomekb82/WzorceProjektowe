package observer;

/**
 * Created by tomek on 14.08.16.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
