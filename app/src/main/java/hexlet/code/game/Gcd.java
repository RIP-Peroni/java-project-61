package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public class Gcd implements Game {
    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static void startGame() throws Exception {
        GameEngine.launchEngine(new Gcd());
    }
    public String getQuestion() {
        int min = 1;
        int max = 100;
        int randomNumber1 = Util.getRandomNumber(min, max);
        int randomNumber2 = Util.getRandomNumber(min, max);
        return randomNumber1 + " " + randomNumber2;
    }

    public String getRightAnswer(String question) {
        String[] operators = question.split(" ");
        int operator1 = Integer.parseInt(operators[0]);
        int operator2 = Integer.parseInt(operators[1]);
        return String.valueOf(Util.calculateGcd(operator1, operator2));
    }
}
