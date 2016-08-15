package singleton;

/**
 * Created by tomek on 15.08.16.
 */
public class MultithreadingSingleton {

    private static MultithreadingSingleton uniqueInstance;

    private MultithreadingSingleton() {}

    public static synchronized MultithreadingSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MultithreadingSingleton();
        }
        return uniqueInstance;
    }
}
