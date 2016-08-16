package facade;

/**
 * Created by tomek on 16.08.16.
 */
public class Amplifier {
    public void off() {
        System.out.println(getClass().getSimpleName() + " off");
    }

    public void setVolume(int i) {
        System.out.println(getClass().getSimpleName() + " setVolume");
    }

    public void setSurroundSound() {
        System.out.println(getClass().getSimpleName() + " setSurroundSound");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println(getClass().getSimpleName() + " setDvd");
    }

    public void on() {
        System.out.println(getClass().getSimpleName() + " on");
    }
}
