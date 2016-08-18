package template;

/**
 * Created by tomek on 18.08.16.
 */
public abstract class Beverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();
    abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater(){
         System.out.println("Boiling water");
     }
}
