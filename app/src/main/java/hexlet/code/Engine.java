package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int AMOUNT_CORRECT_ANSWERS = 3;

    public static String greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void runGame(String task, String[][] questionsAnswers) {
        String userName = greetings();
        int countAnswers = 0;
        boolean wasCorrectAnswer = true;

        System.out.println(task);
        while (countAnswers < AMOUNT_CORRECT_ANSWERS && wasCorrectAnswer) {
            wasCorrectAnswer = checkAnswer(questionsAnswers[countAnswers][0], questionsAnswers[countAnswers][1]);
            countAnswers++;
        }

        if (wasCorrectAnswer) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
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
