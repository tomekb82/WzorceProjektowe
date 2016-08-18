package template;

/**
 * Created by tomek on 18.08.16.
 */
public class Tea extends Beverage {
    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }
}
