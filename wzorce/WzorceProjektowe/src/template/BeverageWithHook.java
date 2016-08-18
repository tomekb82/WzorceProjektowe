package template;

/**
 * Created by tomek on 18.08.16.
 */
public abstract class BeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    /* Hook - subclass can override this method, but doesn’t have to*/
    boolean customerWantsCondiments() {
        return true;
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
