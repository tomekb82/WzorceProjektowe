package template;

import decorator.Beverage;
import decorator.Cappucino;
import decorator.Espresso;
import decorator.Milk;

/**
 * Created by tomek on 15.08.16.
 */
public class Main {

    public static void main(String[] args) {

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making coffee");
        coffeeWithHook.prepareRecipe();




    }
}
