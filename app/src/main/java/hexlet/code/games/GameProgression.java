package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GameProgression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int AMOUNT_NUMBERS = 10; // amount of numbers in progression
    private static final int MAX_FIRST_NUMBER = 20; // the maximum possible first number in progression
    private static final int MAX_ADDICTIVE = 4; // // the maximum possible addition to the number
    private static final int MIN_ADDICTIVE = 2; // // the minimum possible addition to the number

    public static void gameProgression() {
        Random rand = new Random();
        String[][] questionsAnswers = new String[Engine.AMOUNT_CORRECT_ANSWERS][2];

        for (int i = 0; i < Engine.AMOUNT_CORRECT_ANSWERS; i++) {
            int addictive = rand.nextInt(MIN_ADDICTIVE, MAX_ADDICTIVE);
            int gap = rand.nextInt(0, AMOUNT_NUMBERS);
            int firstNumber = rand.nextInt(MAX_FIRST_NUMBER);

            int[] progression = makeProgression(firstNumber, addictive);

            questionsAnswers[i][0] = hideNumber(progression, gap);
            questionsAnswers[i][1] = String.valueOf(newProgressionNumber(firstNumber, addictive, gap));
        }
        Engine.runGame(TASK, questionsAnswers);
    }

    public static int[] makeProgression(int firstNumber, int addictive) {
        int[] progression = new int[AMOUNT_NUMBERS];
        for (int i = 0; i < AMOUNT_NUMBERS; i++) {
            progression[i] = newProgressionNumber(firstNumber, addictive, i);
        }
        return progression;
    }

    public static String hideNumber(int[] progression, int gap) {
        String result = "";
        for (int i = 0; i < AMOUNT_NUMBERS; i++) {
            if (i != gap) {
                result  = result + " " + progression[i];
            } else {
                result = result + " ..";
            }
        }
        return result.trim();
    }

    public static int newProgressionNumber(int firstNumber, int addictive, int count) {
        return firstNumber + addictive * count;
    }
}
