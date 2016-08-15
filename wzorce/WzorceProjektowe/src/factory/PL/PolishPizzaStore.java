package factory.PL;

import factory.Pizza;
import factory.PizzaStore;

/**
 * Created by tomek on 15.08.16.
 */
public class PolishPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new PolishCheesePizza();
        } else if(type.equals("pepperoni")){
            return new PolishPepperoniPizza();
        }
        return null;
    }
}
