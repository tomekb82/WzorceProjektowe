package state;

/**
 * Created by tomek on 18.08.16.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
