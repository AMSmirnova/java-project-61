package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameGCD {
    public static void gameGCD() {
        if (Engine.userName == null) {
            Engine.greetings();
        }
        System.out.println("Find the greatest common divisor of given numbers.");

        Random rand = new Random();

        while (Engine.countCorrectAnswers < 3 && !Engine.wasFalseAnswer) {
            int number1 = rand.nextInt(3, 51);
            int number2 = rand.nextInt(3, 51);
            Engine.correctAnswer = String.valueOf(gcd(number1, number2));
            Engine.checkAnswer(number1 + " " + number2);
        }
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
