package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public final class Gcd implements Game {
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int MAX_RANDOM_NUMBER = 100;
    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static void startGame() throws Exception {
        GameEngine.launchEngine(new Gcd());
    }
    public String getQuestion() {
        int randomNumber1 = Util.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        int randomNumber2 = Util.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        return randomNumber1 + " " + randomNumber2;
    }

    public String getRightAnswer(String question) {
        String[] operators = question.split(" ");
        int operator1 = Integer.parseInt(operators[0]);
        int operator2 = Integer.parseInt(operators[1]);
        return String.valueOf(Util.calculateGcd(operator1, operator2));
    }
}
