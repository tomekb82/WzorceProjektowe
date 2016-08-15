package factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomek on 15.08.16.
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List toppings = new ArrayList<>();

    void prepare(){
        System.out.println("Preparing " + name);
    }
    void bake(){
        System.out.println("Baking...");
    }
    void cut(){
        System.out.println("Cutting...");
    }
    void box(){
        System.out.println("Boxing...");
    }

    public String getName(){
        return name;
    }
}
