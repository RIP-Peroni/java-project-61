package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public final class Prime implements Game {
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int MAX_RANDOM_NUMBER = 100;
    public String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public static void startGame() throws Exception {
        GameEngine.launchEngine(new Prime());
    }
    public String getQuestion() {
        return String.valueOf(Util.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER));
    }

    public String getRightAnswer(String question) {
        return Util.isPrime(Integer.parseInt(question)) ? "yes" : "no";
    }
}
