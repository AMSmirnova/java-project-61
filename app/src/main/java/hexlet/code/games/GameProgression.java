package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameProgression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int AMOUNT_NUMBERS = 10; // amount of numbers in progression
    private static final int MAX_FIRST_NUMBER = 20; // the maximum possible first number in progression
    private static final int MAX_ADDICTIVE = 4; // // the maximum possible addition to the number
    private static final int MIN_ADDICTIVE = 1; // // the minimum possible addition to the number

    public static void gameProgression() {
        Random rand = new Random();
        String[] questions = new String[Engine.AMOUNT_CORRECT_ANSWERS];
        String[] correctAnswers = new String[Engine.AMOUNT_CORRECT_ANSWERS];

        for (int i = 0; i < Engine.AMOUNT_CORRECT_ANSWERS; i++) {
            int addictive = rand.nextInt(MIN_ADDICTIVE, MAX_ADDICTIVE);
            int gap = rand.nextInt(0, AMOUNT_NUMBERS);
            int firstNumber = rand.nextInt(MAX_FIRST_NUMBER);

            correctAnswers[i] = String.valueOf(newProgressionNumber(firstNumber, addictive, gap));
            questions[i] = makeProgression(firstNumber, addictive, gap);
        }
        Engine.runGame(TASK, questions, correctAnswers);
    }

    public static String makeProgression(int firstNumber, int addictive, int gap) {
        String progression = "";
        for (int i = 0; i < AMOUNT_NUMBERS; i++) {
            if (i != gap) {
                progression = progression + " " + newProgressionNumber(firstNumber, addictive, i);
            } else {
                progression = progression + " ..";
            }
        }
        return progression.trim();
    }

    public static int newProgressionNumber(int firstNumber, int addictive, int count) {
        return firstNumber + addictive * count;
    }
}
