package singleton;

/**
 * Created by tomek on 15.08.16.
 */
public class SimpleSingleton {

    private static SimpleSingleton uniqueInstance;

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SimpleSingleton();
        }
        return uniqueInstance;
    }
}
