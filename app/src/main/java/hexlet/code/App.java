package hexlet.code;

import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        newGame();
    }
    public static void newGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = scanner.next();

        switch (userChoice) {
            case "1" -> Engine.greetings();
            case "2" -> GameEven.gameEven();
            case "3" -> GameCalc.gameCalc();
            case "4" -> GameGCD.gameGCD();
            case "5" -> GameProgression.gameProgression();
            case "6" -> GamePrime.gamePrime();
            default -> {
            }
        }
        scanner.close();
    }
}
