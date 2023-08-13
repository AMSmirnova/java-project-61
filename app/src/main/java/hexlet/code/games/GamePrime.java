package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GamePrime {
    private static final int MAX_NUMBER = 50; // the maximum possible number in the task
    private static final int MIN_NUMBER = 2; // the minimum possible number in the task
    public static void gamePrime() {
        String userName = Engine.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        boolean wasCorrectAnswer = true;
        Random rand = new Random();
        int countCorrectAnswers = 0;

        while (countCorrectAnswers < Engine.AMOUNT_CORRECT_ANSWERS && wasCorrectAnswer) {
            int number = rand.nextInt(MIN_NUMBER, MAX_NUMBER);
            String correctAnswer = isPrime(number);
            String question = String.valueOf(number);
            wasCorrectAnswer = Engine.checkAnswer(question, correctAnswer);
            if (wasCorrectAnswer) {
                countCorrectAnswers++;
            }
        }
        if (countCorrectAnswers == Engine.AMOUNT_CORRECT_ANSWERS) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }

    public static String isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
