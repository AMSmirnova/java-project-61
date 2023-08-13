package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameGCD {
    private static final int MIN_NUMBERS = 3;
    private static final int MAX_NUMBERS = 51;
    public static void gameGCD() {
        String userName = Engine.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");

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
            int number1 = rand.nextInt(MIN_NUMBERS, MAX_NUMBERS);
            int number2 = rand.nextInt(MIN_NUMBERS, MAX_NUMBERS);
            String correctAnswer = String.valueOf(gcd(number1, number2));
            String question = number1 + " " + number2;
            if (!Engine.checkAnswer(question, correctAnswer)) {
                return false;
            }
            countCorrectAnswers++;
        }
        return true;
    }

    public static int gcd(int number1, int number2) {
        int length = Math.min(number1, number2);
        for (int i = length; i > 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
