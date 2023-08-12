package hexlet.code;

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
