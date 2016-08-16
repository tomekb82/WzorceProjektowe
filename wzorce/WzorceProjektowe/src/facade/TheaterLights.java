package facade;

/**
 * Created by tomek on 16.08.16.
 */
public class TheaterLights {
    public void dim(int i) {
        System.out.println(getClass().getSimpleName() + " dim");
    }

    public void on() {
        System.out.println(getClass().getSimpleName() + " on");

    }
}
