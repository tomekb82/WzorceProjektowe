package factory;

/**
 * Created by tomek on 15.08.16.
 */
public class Main {

    public static void main(String[] args) {
      SimplePizzaFactory factory = new SimplePizzaFactory();
      PizzaStore store = new PizzaStore(factory);
      store.order("pepperoni");
    }
}
