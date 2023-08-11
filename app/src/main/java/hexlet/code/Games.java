package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {
    public static String userName;

    public static void greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!\n");

    }
    public static void gameEven() {
        if (userName == null) {
            greetings();
        }

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        boolean wasFalseAnswer = false;
        int question;
        int countOfAnswers = 0;
        String rightAnswer;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (countOfAnswers < 3 && !wasFalseAnswer) {
            question = rand.nextInt();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next().toLowerCase();
            rightAnswer = question % 2 == 0 ? "yes" : "no";

            if (userAnswer.equals(rightAnswer)) {
                countOfAnswers++;
                System.out.println("Correct!");
            } else {
                wasFalseAnswer = true;
                System.out.println("'"
                        + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswer
                        + "'.\n"
                        + "Let's try again, "
                        + userName
                        + "!\n");
            }
        }

        if (countOfAnswers == 3) {
            System.out.println("\nCongratulations, " + userName + "!\n");
        }
//        scanner.close();
    }
}
