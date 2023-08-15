package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GamePrime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 50; // the maximum possible number in the task
    private static final int MIN_NUMBER = 2; // the minimum possible number in the task
    public static void gamePrime() {
        Random rand = new Random();
        String[] questions = new String[Engine.AMOUNT_CORRECT_ANSWERS];
        String[] correctAnswers = new String[Engine.AMOUNT_CORRECT_ANSWERS];

        for (int i = 0; i < Engine.AMOUNT_CORRECT_ANSWERS; i++) {
            int number = rand.nextInt(MIN_NUMBER, MAX_NUMBER);
            correctAnswers[i] = isPrime(number) ? "yes" : "no";
            questions[i] = String.valueOf(number);
        }
        Engine.runGame(TASK, questions, correctAnswers);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
