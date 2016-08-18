package composite;

import java.util.Iterator;

/**
 * Created by tomek on 18.08.16.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
