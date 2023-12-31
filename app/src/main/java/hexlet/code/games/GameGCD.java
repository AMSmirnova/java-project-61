package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameGCD {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    private static final int MIN_NUMBERS = 3;
    private static final int MAX_NUMBERS = 51;

    public static void gameGCD() {
        Random rand = new Random();
        String[][] questionsAnswers = new String[Engine.AMOUNT_CORRECT_ANSWERS][2];

        for (int i = 0; i < Engine.AMOUNT_CORRECT_ANSWERS; i++) {
            int number1 = rand.nextInt(MIN_NUMBERS, MAX_NUMBERS);
            int number2 = rand.nextInt(MIN_NUMBERS, MAX_NUMBERS);
            questionsAnswers[i][0] = number1 + " " + number2;
            questionsAnswers[i][1] = String.valueOf(findGCD(number1, number2));
        }
        Engine.runGame(TASK, questionsAnswers);
    }

    public static int findGCD(int number1, int number2) {
        int length = Math.min(number1, number2);
        for (int i = length; i > 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
