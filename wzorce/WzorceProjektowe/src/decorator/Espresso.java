package decorator;

/**
 * Created by tomek on 15.08.16.
 */
public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 8.00;
    }
}
