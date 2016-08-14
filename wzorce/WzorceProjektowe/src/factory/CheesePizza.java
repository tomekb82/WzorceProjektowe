package factory;

/**
 * Created by tomek on 15.08.16.
 */
public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing " + getName());
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
