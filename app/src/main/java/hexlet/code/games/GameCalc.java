package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameCalc {
    private static final int MAX_NUMBERS = 16; // the maximum possible numbers in the task
    private static final int MAX_SIGN = 3; // amount of signs
    public static void gameCalc() {
        String userName = Engine.greetings();
        System.out.println("What is the result of the expression?");
        boolean wasCorrectAnswer = true;
        Random rand = new Random();
        int countCorrectAnswers = 0;

        while (countCorrectAnswers < Engine.AMOUNT_CORRECT_ANSWERS && wasCorrectAnswer) {
            int number1 = rand.nextInt(0, MAX_NUMBERS);
            int number2 = rand.nextInt(0, MAX_NUMBERS);
            int sign = rand.nextInt(0, MAX_SIGN);
            String correctAnswer = "";
            String question = "";
            switch (sign) {
                case 0 -> { // +
                    correctAnswer = String.valueOf(number1 + number2);
                    question = number1 + " + " + number2;
                }
                case 1 -> { // -
                    correctAnswer = String.valueOf(number1 - number2);
                    question = number1 + " - " + number2;
                }
                case 2 -> { // *
                    correctAnswer = String.valueOf(number1 * number2);
                    question = number1 + " * " + number2;
                }
                default -> {
                }
            }
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
}
