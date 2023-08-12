package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameEven {
    public static void gameEven() {

        Random rand = new Random();
        int question;

        System.out.println("\nAnswer 'yes' if the number is even, otherwise answer 'no'.");

        while (Engine.countCorrectAnswers < 3 && !Engine.wasFalseAnswer) {
            question = rand.nextInt();
            Engine.correctAnswer = question % 2 == 0 ? "yes" : "no";
            Engine.checkAnswer(String.valueOf(question));
        }
        Engine.countCorrectAnswers = 0;
        Engine.wasFalseAnswer = false;
    }
}
