package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomek on 18.08.16.
 */
public class BreakfastMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    List<MenuItem> menuItems;

    public BreakfastMenu() {
        menuItems = new ArrayList<>();
        addItem("Vegetarian BLT", "(Fakin’)Bacon with lettuce & tomato on whole wheat",true,12.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false,13.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false,13.05);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can’t add item to menu");
        } else {
            menuItems.add(menuItem);
            numberOfItems += 1;
        }
    }
    public Iterator createIterator(){
        return new BreakfastMenuIterator(menuItems);
    }

    public java.util.Iterator createIteratorJavaUtil(){
        return menuItems.iterator();
    }
}
