package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameEven {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void gameEven() {
        Random rand = new Random();
        String[][] questionsAnswers = new String[Engine.AMOUNT_CORRECT_ANSWERS][2];
        for (int i = 0; i < Engine.AMOUNT_CORRECT_ANSWERS; i++) {
            int number = rand.nextInt();
            questionsAnswers[i][0] = String.valueOf(number);
            questionsAnswers[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.runGame(TASK, questionsAnswers);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
