package facade;

/**
 * Created by tomek on 16.08.16.
 */
public class DvdPlayer {
    public void off() {
        System.out.println(getClass().getSimpleName() + " off");
    }

    public void eject() {
        System.out.println(getClass().getSimpleName() + " eject");
        
    }

    public void stop() {
        System.out.println(getClass().getSimpleName() + " stop");
    }

    public void play(String movie) {
        System.out.println(getClass().getSimpleName() + " play");
    }

    public void on() {
        System.out.println(getClass().getSimpleName() + " on");

    }
}
