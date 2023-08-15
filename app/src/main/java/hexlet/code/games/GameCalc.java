package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameCalc {
    private static final String TASK = "What is the result of the expression?";
    private static final int MAX_NUMBERS = 16; // the maximum possible numbers in the task
    private static final int MAX_SIGN = 3; // amount of signs
    public static void gameCalc() {
        Random rand = new Random();
        String[] questions = new String[Engine.AMOUNT_CORRECT_ANSWERS];
        String[] correctAnswers = new String[Engine.AMOUNT_CORRECT_ANSWERS];

        for (int i = 0; i < Engine.AMOUNT_CORRECT_ANSWERS; i++) {
            int number1 = rand.nextInt(0, MAX_NUMBERS);
            int number2 = rand.nextInt(0, MAX_NUMBERS);
            char signChar = getSign(rand.nextInt(0, MAX_SIGN));

            correctAnswers[i] = String.valueOf(calc(number1, number2, signChar));
            questions[i] = number1 + " " + signChar + " " + number2;
        }
        Engine.runGame(TASK, questions, correctAnswers);
    }
    public static char getSign(int sign) {
        switch (sign) {
            case 0 -> {
                return '+';
            }
            case 1 -> {
                return '-';
            }
            case 2 -> {
                return '*';
            }
            default -> {
            }
        } return ' ';
    }

    public static int calc(int number1, int number2, char sign) {
        switch (sign) {
            case '+' -> { // +
                return number1 + number2;
            }
            case '-' -> { // -
                return number1 - number2;
            }
            case '*' -> { // *
                return number1 * number2;

            }
            default -> {
            }
        }
        return 0;
    }
}
