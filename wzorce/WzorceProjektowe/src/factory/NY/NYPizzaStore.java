package factory.NY;

import factory.Pizza;
import factory.PizzaStore;

/**
 * Created by tomek on 15.08.16.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYCheesePizza();
        } else if(type.equals("pepperoni")){
            return new NYPepperoniPizza();
        }
        return null;
    }
}
