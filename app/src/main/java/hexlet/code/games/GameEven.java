package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameEven {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void gameEven() {
        Random rand = new Random();
        String[] questions = new String[Engine.AMOUNT_CORRECT_ANSWERS];
        String[] correctAnswers = new String[Engine.AMOUNT_CORRECT_ANSWERS];
        for (int i = 0; i < Engine.AMOUNT_CORRECT_ANSWERS; i++) {
            int number = rand.nextInt();
            correctAnswers[i] = isEven(number) ? "yes" : "no";
            questions[i] = String.valueOf(number);
        }
        Engine.runGame(TASK, questions, correctAnswers);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
