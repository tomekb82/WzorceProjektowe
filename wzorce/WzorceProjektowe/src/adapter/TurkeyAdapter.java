package adapter;

import java.util.stream.IntStream;

/**
 * Created by tomek on 16.08.16.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        IntStream.range(0, 5).forEach(idx -> turkey.fly());
    }
}
