package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameEven {
    public static void gameEven() {
        if (Engine.userName == null) {
            Engine.greetings();
        }
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random rand = new Random();
        int question;

        while (Engine.countCorrectAnswers < 3 && !Engine.wasFalseAnswer) {
            question = rand.nextInt();
            Engine.correctAnswer = question % 2 == 0 ? "yes" : "no";
            Engine.checkAnswer(String.valueOf(question));
        }
    }
}
