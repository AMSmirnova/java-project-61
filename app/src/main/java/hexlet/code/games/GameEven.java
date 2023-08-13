package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameEven {
    public static void gameEven() {
        String userName = Engine.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

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
            int number = rand.nextInt();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            String question = String.valueOf(number);
            if (!Engine.checkAnswer(question, correctAnswer)) {
                return false;
            }
            countCorrectAnswers++;
        }
        return true;
    }
}
