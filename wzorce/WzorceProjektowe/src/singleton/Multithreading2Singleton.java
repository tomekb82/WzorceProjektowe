package singleton;

/**
 * Created by tomek on 15.08.16.
 */
public class Multithreading2Singleton {

    private static Multithreading2Singleton uniqueInstance = new Multithreading2Singleton();

    private Multithreading2Singleton() {
    }

    public static Multithreading2Singleton getInstance() {
        return uniqueInstance;
    }
}
