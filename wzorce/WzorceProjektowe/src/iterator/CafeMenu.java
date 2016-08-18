package iterator;

import java.util.Hashtable;

/**
 * Created by tomek on 18.08.16.
 */
public class CafeMenu implements Menu{

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Hashtable menuItems;

    public CafeMenu() {
        menuItems = new Hashtable();

        addItem("Coffee", "American coffee", false,3.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can’t add item to menu");
        } else {
            menuItems.put(menuItem.getName(), menuItem);
            numberOfItems += 1;
        }
    }
    public Iterator createIterator(){
        return null;
    }

    @Override
    public java.util.Iterator createIteratorJavaUtil() {
        return menuItems.values().iterator();
    }

}
