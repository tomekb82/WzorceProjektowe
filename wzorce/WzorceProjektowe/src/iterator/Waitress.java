package iterator;

/**
 * Created by tomek on 18.08.16.
 */
public class Waitress {
    Menu dinerMenu;
    Menu breakfastMenu;
    Menu cafeMenu;

    public Waitress(Menu dinerMenu, Menu breakfastMenu, Menu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.breakfastMenu = breakfastMenu;
        this.cafeMenu = cafeMenu;
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
        java.util.Iterator dinerIterator = dinerMenu.createIteratorJavaUtil();
        java.util.Iterator breakfastIterator = breakfastMenu.createIteratorJavaUtil();
        java.util.Iterator cafeIterator = cafeMenu.createIteratorJavaUtil();
        System.out.println("\n Breakfast");
        printMenuJavaUtil(breakfastIterator);
        System.out.println("\n DINER");
        printMenuJavaUtil(dinerIterator);
        System.out.println("\n CAFE");
        printMenuJavaUtil(cafeIterator);
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
