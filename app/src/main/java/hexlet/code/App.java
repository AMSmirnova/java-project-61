package hexlet.code;

import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Engine.userChoice = "1";

        while (!Engine.userChoice.equals("0")) {

            System.out.println("Please enter the game number and press Enter.\n"
                    + "1 - Greet\n"
                    + "2 - Even\n"
                    + "3 - Calc\n"
                    + "0 - Exit");
            System.out.print("Your choice: ");
            Engine.userChoice = scanner.next();

            if (Engine.userName == null && !Engine.userChoice.equals("1")) {
                Engine.greetings();
            }

            switch (Engine.userChoice) {
                case "1":
                    Engine.greetings();
                    break;
                case "2":
                    GameEven.gameEven();
                    break;
                case "3":
                    GameCalc.gameCalc();
                    break;
                case "0":
                    System.out.println("See you soon!");
                    break;
                default:
                    System.out.println("incorrect number\n");
            }
        }
        scanner.close();
    }
}
