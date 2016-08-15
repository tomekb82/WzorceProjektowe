package factory;

import factory.NY.NYPizzaStore;
import factory.PL.PolishPizzaStore;

/**
 * Created by tomek on 15.08.16.
 */
public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore polishStore = new PolishPizzaStore();

        Pizza pizza = nyStore.order("cheese");
        System.out.println("Ordered: " + pizza.getName() + "\n");

        pizza = polishStore.order("cheese");
        System.out.println("Ordered: " + pizza.getName() + "\n");
    }
}

