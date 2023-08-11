package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "1";

        while (!userChoice.equals("0")) {

            System.out.println("Please enter the game number and press Enter.\n"
                    + "1 - Greet\n"
                    + "2 - Even\n"
                    + "0 - Exit");
            System.out.print("Your choice: ");
            userChoice = scanner.next();

            switch (userChoice) {
                case "1":
                    Games.greetings();
                    break;
                case "2":
                    Games.gameEven();
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
