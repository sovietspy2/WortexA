import Controller.Controller;
import model.Target;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    private static void consoleInput() throws IOException {

        Controller controller = new Controller();

        List<Target> targets = controller.loadTargets();

        // INPUT
        String input = "not_exit";
        while (!input.equals("exit")) { // exitre kilép
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            input = reader.readLine();

            // ITT LEHET DOLGOZNI AZ INPUTTAL TALALJ KI HASZNALATI DOLGOKAT csinalok egy peldat

            switch (input){
                case "print targets": // EZ EGY PÉLDA
                    for (Target targi : targets) {
                        System.out.println(targi);
                    }
            }
        }
    }

    public static void main(String[] args)  {
        try {
            consoleInput(); // ez csak elindítja az egészet
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

}
