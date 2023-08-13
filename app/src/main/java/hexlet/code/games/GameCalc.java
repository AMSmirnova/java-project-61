package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameCalc {
    public static void gameCalc() {
        Random rand = new Random();

        System.out.println("What is the result of the expression?");

        while (Engine.countCorrectAnswers < 3 && !Engine.wasFalseAnswer) {
            int number1 = rand.nextInt(0, 16);
            int number2 = rand.nextInt(0, 16);
            int sign = rand.nextInt(0, 3);
            switch (sign) {
                case 0:
                    Engine.correctAnswer = String.valueOf(number1 + number2);
                    Engine.checkAnswer(number1 + " + " + number2);
                    break;
                case 1:
                    Engine.correctAnswer = String.valueOf(number1 - number2);
                    Engine.checkAnswer(number1 + " - " + number2);
                    break;
                case 2:
                    Engine.correctAnswer = String.valueOf(number1 * number2);
                    Engine.checkAnswer(number1 + " * " + number2);
                    break;
                default:
                    break;
            }
        }
//        Engine.countCorrectAnswers = 0;
//        Engine.wasFalseAnswer = false;
    }
}
