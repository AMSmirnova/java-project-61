package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public class GameProgression {
    public static void gameProgression() {
        Engine.greetings();
        System.out.println("What number is missing in the progression?");
        Random rand = new Random();

        while (Engine.countCorrectAnswers < 3 && !Engine.wasFalseAnswer) {
            int amountOfNumbers = 10;
            String[] numbersString = new String[amountOfNumbers];
            int[] numbers = new int[amountOfNumbers];
            int addictive = rand.nextInt(1, 4);
            int gap = rand.nextInt(0, amountOfNumbers);
            numbers[0] = rand.nextInt(20);
            numbersString[0] = String.valueOf(numbers[0]);

            for (int i = 1; i < amountOfNumbers; i++) {
                numbers[i] = numbers[i - 1] + addictive;
                numbersString[i] = String.valueOf(numbers[i]);
            }
            Engine.correctAnswer = numbersString[gap];
            numbersString[gap] = "..";
            String question = Arrays.toString(numbersString)
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "");
            Engine.checkAnswer(question);
        }
    }

}
