package decorator;

/**
 * Created by tomek on 15.08.16.
 */
public class Cappucino extends Beverage{

    public Cappucino() {
        setDescription("Cappucino");
    }

    @Override
    public double cost() {
        return 6.88;
    }
}
