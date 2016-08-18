package template;

/**
 * Created by tomek on 18.08.16.
 */
public class Coffee extends Beverage {
    @Override
    void addCondiments() {
        System.out.println("Adding sugar & milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping cofee throug filter");
    }
}
