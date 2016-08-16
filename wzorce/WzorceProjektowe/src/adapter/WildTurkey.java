package adapter;

/**
 * Created by tomek on 16.08.16.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
