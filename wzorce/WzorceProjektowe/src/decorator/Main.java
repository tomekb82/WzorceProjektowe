package decorator;

/**
 * Created by tomek on 15.08.16.
 */
public class Main {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        System.out.println(espresso);

        Beverage cappucino = new Cappucino();
        cappucino = new Milk(cappucino);
        cappucino = new Milk(cappucino);
        System.out.println(cappucino);
    }
}
