package factory;

/**
 * Created by tomek on 15.08.16.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }

        return pizza;
    }

}
