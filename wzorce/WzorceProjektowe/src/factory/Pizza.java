package factory;

/**
 * Created by tomek on 15.08.16.
 */
public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();

    default String getName(){
        return getClass().getSimpleName();
    }
}
