package hexlet.code;

import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;

import java.util.Scanner;

public class Engine {
    public static String userName;
    public static String userChoice;
    public static String userAnswer;
    public static String correctAnswer;
    public static boolean wasFalseAnswer = false;
    public static int countCorrectAnswers = 0;

    public static void greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void runGame() {
        if (userName == null && !userChoice.equals("1")) {
            greetings();
        }
        countCorrectAnswers = 0;
        wasFalseAnswer = false;

        switch (userChoice) {
            case "1":
                greetings();
                break;
            case "2":
                GameEven.gameEven();
                break;
            case "3":
                GameCalc.gameCalc();
                break;
            case "4":
                GameGCD.gameGCD();
                break;
            case "5":
                GameProgression.gameProgression();
                break;
            case "0":
                System.out.println("See you soon!");
                break;
            default:
                System.out.println("incorrect number\n");
        }
    }
    public static void checkAnswer(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        userAnswer = scanner.next().toLowerCase();

        if (userAnswer.equals(correctAnswer)) {
            countCorrectAnswers++;
            System.out.println("Correct!");
        } else {
            wasFalseAnswer = true;
            System.out.println("'"
                    + userAnswer
                    + "' is wrong answer ;(. Correct answer was '"
                    + correctAnswer
                    + "'.\n"
                    + "Let's try again, "
                    + userName
                    + "!\n");
        }

        if (countCorrectAnswers == 3) {
            System.out.println("\nCongratulations, " + userName + "!\n");
        }

    }
}
