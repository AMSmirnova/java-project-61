package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GamePrime {
    public static void gamePrime() {
        if (Engine.userName == null) {
            Engine.greetings();
        }
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random rand = new Random();

        while (Engine.countCorrectAnswers < 3 && !Engine.wasFalseAnswer) {
            int question = rand.nextInt(2, 50);
            Engine.correctAnswer = isPrime(question);
            Engine.checkAnswer(String.valueOf(question));
        }
    }

    public static String isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
