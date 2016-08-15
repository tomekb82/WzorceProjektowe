package factory;

/**
 * Created by tomek on 15.08.16.
 */
public abstract class PizzaStore {

    public Pizza order(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
