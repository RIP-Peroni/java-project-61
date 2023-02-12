package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public final class Gcd implements Game {
    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static void startGame() throws Exception {
        GameEngine.launchEngine(new Gcd());
    }
    public String getQuestion() {
        int minRandom = 1;
        int maxRandom = 100;
        int randomNumber1 = Util.getRandomNumber(minRandom, maxRandom);
        int randomNumber2 = Util.getRandomNumber(minRandom, maxRandom);
        return randomNumber1 + " " + randomNumber2;
    }

    public String getRightAnswer(String question) {
        String[] operators = question.split(" ");
        int operator1 = Integer.parseInt(operators[0]);
        int operator2 = Integer.parseInt(operators[1]);
        return String.valueOf(Util.calculateGcd(operator1, operator2));
    }
}
