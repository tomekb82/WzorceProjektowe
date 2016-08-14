package decorator;

/**
 * Created by tomek on 15.08.16.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage; // instance variable to hold the object we're wrapping

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
