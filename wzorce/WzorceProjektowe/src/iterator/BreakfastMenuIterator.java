package iterator;

import java.util.List;

/**
 * Created by tomek on 18.08.16.
 */
public class BreakfastMenuIterator implements Iterator {

    List<MenuItem> items;
    int position = 0;

    public BreakfastMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(items == null){
            return false;
        }
        if(position >= items.size() || items.get(position) == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}
