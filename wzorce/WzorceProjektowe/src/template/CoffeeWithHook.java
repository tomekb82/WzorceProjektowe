package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tomek on 18.08.16.
 */
public class CoffeeWithHook extends BeverageWithHook {
    @Override
    void addCondiments() {
        System.out.println("Adding sugar & milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping cofee throug filter");
    }

    /* Overide hook */
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("Error trying to read your answer");
        }
        if (answer == null) {
            return "n";
        }
        return answer;
    }

}
