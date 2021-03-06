package adapter;

import decorator.Beverage;
import decorator.Cappucino;
import decorator.Espresso;
import decorator.Milk;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by tomek on 15.08.16.
 */
public class Main {

    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("turkey says:");
        turkey.gobble();
        turkey.fly();

        System.out.println("turkey adatper says:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
