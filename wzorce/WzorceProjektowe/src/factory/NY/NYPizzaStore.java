package factory.NY;

import factory.CheesePizza;
import factory.PepperoniPizza;
import factory.Pizza;
import factory.PizzaStore;
import factory.ingredients.PizzaIngredientFactory;

/**
 * Created by tomek on 15.08.16.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY cheese pizza");
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY pepperoni pizza");
        }
        return pizza;
    }
}
