package iterator;

/**
 * Created by tomek on 18.08.16.
 */
public class Waitress {
    DinerMenu dinerMenu;
    BreakfastMenu breakfastMenu;

    public Waitress(DinerMenu dinerMenu, BreakfastMenu breakfastMenu) {
        this.dinerMenu = dinerMenu;
        this.breakfastMenu = breakfastMenu;
    }

    public void printMenu(){
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator breakfastIterator = breakfastMenu.createIterator();
        System.out.println("\n Breakfast");
        printMenu(breakfastIterator);
        System.out.println("\n DINER");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ",");
            System.out.println(menuItem.getPrice() + " --");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printMenuJavaUtilIterator(){
        java.util.Iterator dinerIterator = dinerMenu.createIteratorjavaUtil();
        java.util.Iterator breakfastIterator = breakfastMenu.createIteratorJavaUtil();
        System.out.println("\n Breakfast");
        printMenuJavaUtil(breakfastIterator);
        System.out.println("\n DINER");
        printMenuJavaUtil(dinerIterator);
    }

    private void printMenuJavaUtil(java.util.Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ",");
            System.out.println(menuItem.getPrice() + " --");
            System.out.println(menuItem.getDescription());
        }
    }
}
