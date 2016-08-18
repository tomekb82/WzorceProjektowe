package iterator;

/**
 * Created by tomek on 15.08.16.
 */
public class Main {

    public static void main(String[] args) {

        DinerMenu dinerMenu = new DinerMenu();
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(dinerMenu, breakfastMenu, cafeMenu);

        //waitress.printMenu();
        waitress.printMenuJavaUtilIterator();

    }
}
