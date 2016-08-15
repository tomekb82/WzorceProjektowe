package factory;

import factory.ingredients.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomek on 15.08.16.
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected List toppings = new ArrayList();

    public abstract void prepare();

    void bake(){
        System.out.println("Baking...");
    }
    void cut(){
        System.out.println("Cutting...");
    }
    void box(){
        System.out.println("Boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
