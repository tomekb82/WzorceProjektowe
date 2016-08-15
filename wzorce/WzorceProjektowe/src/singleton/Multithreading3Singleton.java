package singleton;

/**
 * Created by tomek on 15.08.16.
 */
public class Multithreading3Singleton {

    private volatile static Multithreading3Singleton uniqueInstance;
    private Multithreading3Singleton() {}

    public static Multithreading3Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Multithreading3Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Multithreading3Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
