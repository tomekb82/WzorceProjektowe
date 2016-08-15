package factory.PL;

import factory.CheesePizza;
import factory.PepperoniPizza;
import factory.Pizza;
import factory.PizzaStore;
import factory.ingredients.PizzaIngredientFactory;

/**
 * Created by tomek on 15.08.16.
 */
public class PolishPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new PolishPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Polish cheese pizza");
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Polish pepperoni pizza");
        }
        return pizza;
    }
}
