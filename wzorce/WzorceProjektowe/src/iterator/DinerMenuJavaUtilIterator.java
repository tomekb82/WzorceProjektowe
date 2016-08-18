package iterator;

import java.util.Iterator;
/**
 * Created by tomek on 18.08.16.
 */
public class DinerMenuJavaUtilIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuJavaUtilIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(items == null){
            return false;
        }
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
        }
        shiftElements();
    }

    private void shiftElements() {
        if (items[position-1] != null) {
            for (int i = position-1; i < (items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
