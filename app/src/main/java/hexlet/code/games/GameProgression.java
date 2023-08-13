package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public class GameProgression {
    private static final int AMOUNT_NUMBERS = 10; // amount of numbers in progression
    private static final int MAX_FIRST_NUMBER = 20; // the maximum possible first number in progression
    private static final int MAX_ADDICTIVE = 4; // // the maximum possible addition to the number

    public static void gameProgression() {
        String userName = Engine.greetings();
        System.out.println("What number is missing in the progression?");

        if (resultOfGame()) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
    public static boolean resultOfGame() {
        Random rand = new Random();
        int countCorrectAnswers = 0;

        while (countCorrectAnswers < Engine.AMOUNT_CORRECT_ANSWERS) {
            String[] numbersString = new String[AMOUNT_NUMBERS];
            int[] numbers = new int[AMOUNT_NUMBERS];
            int addictive = rand.nextInt(1, MAX_ADDICTIVE);
            int gap = rand.nextInt(0, AMOUNT_NUMBERS);
            numbers[0] = rand.nextInt(MAX_FIRST_NUMBER);
            numbersString[0] = String.valueOf(numbers[0]);

            for (int i = 1; i < AMOUNT_NUMBERS; i++) {
                numbers[i] = numbers[i - 1] + addictive;
                numbersString[i] = String.valueOf(numbers[i]);
            }
            String correctAnswer = numbersString[gap];
            numbersString[gap] = "..";
            String question = Arrays.toString(numbersString)
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "");
            if (!Engine.checkAnswer(question, correctAnswer)) {
                return false;
            }
            countCorrectAnswers++;
        }
        return true;
    }
}
