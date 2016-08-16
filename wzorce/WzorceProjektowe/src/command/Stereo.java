package command;

/**
 * Created by tomek on 16.08.16.
 */
public class Stereo {

    public Stereo(String place) {
    }

    public void on() {
        System.out.println("Stereo on");
    }
    public void off() {
        System.out.println("Stereo off");
    }
    public void setCD() {
        System.out.println("Stereo set CD");
    }
    public void setDVD() {
        System.out.println("Stereo set DVD");
    }
    public void setRadio() {
        System.out.println("Stereo set radio");
    }
    public void setVolume(int volume) {
        System.out.println("Stereo set Volume on " + volume);
    }
}
