package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameEven {
    public static void gameEven() {
        String userName = Engine.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        boolean wasCorrectAnswer = true;
        Random rand = new Random();
        int countCorrectAnswers = 0;

        while (wasCorrectAnswer && countCorrectAnswers < Engine.AMOUNT_CORRECT_ANSWERS) {
            int question = rand.nextInt();
            String correctAnswer = question % 2 == 0 ? "yes" : "no";
            wasCorrectAnswer = Engine.checkAnswer(String.valueOf(question), correctAnswer);
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
