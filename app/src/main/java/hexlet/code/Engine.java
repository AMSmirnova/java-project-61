package hexlet.code;

import hexlet.code.games.GameEven;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrime;

import java.util.Scanner;

public class Engine {
    public static final int AMOUNT_CORRECT_ANSWERS = 3;

//    private static String userName;
//    public static String userChoice;
//    public static String userAnswer;
//    public static String correctAnswer;
//    public static boolean wasFalseAnswer = false;
//    public static int countCorrectAnswers = 0;

    public static String greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void runGame(String userChoice) {

        switch (userChoice) {
            case "1" -> greetings();
            case "2" -> GameEven.gameEven();
            case "3" -> GameCalc.gameCalc();
            case "4" -> GameGCD.gameGCD();
            case "5" -> GameProgression.gameProgression();
            case "6" -> GamePrime.gamePrime();
            default -> {
            }
        }
    }
    public static boolean checkAnswer(String question, String correctAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String userAnswer = scanner.next().toLowerCase();

        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'"
                    + userAnswer
                    + "' is wrong answer ;(. Correct answer was '"
                    + correctAnswer
                    + "'.");
            return false;
        }
        return true;
    }
}
