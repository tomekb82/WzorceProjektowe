package facade;

/**
 * Created by tomek on 16.08.16.
 */
public class Screen {
    public void down() {
        System.out.println(getClass().getSimpleName() + " dpwn");
    }

    public void up() {
        System.out.println(getClass().getSimpleName() + " up");
    }
}
