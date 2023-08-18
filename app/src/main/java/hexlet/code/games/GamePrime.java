package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GamePrime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 50; // the maximum possible number in the task
    private static final int MIN_NUMBER = 2; // the minimum possible number in the task
    public static void gamePrime() {
        Random rand = new Random();
        String[][] questionsAnswers = new String[Engine.AMOUNT_CORRECT_ANSWERS][2];

        for (int i = 0; i < Engine.AMOUNT_CORRECT_ANSWERS; i++) {
            int number = rand.nextInt(MIN_NUMBER, MAX_NUMBER);
            questionsAnswers[i][0] = String.valueOf(number);
            questionsAnswers[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.runGame(TASK, questionsAnswers);
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
