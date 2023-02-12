package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public class Prime implements Game {
    public String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public static void startGame() throws Exception {
        GameEngine.launchEngine(new Prime());
    }
    public String getQuestion() {
        return String.valueOf(Util.getRandomNumber(1, 100));
    }

    public String getRightAnswer(String question) {
        return Util.isPrime(Integer.parseInt(question)) ? "yes" : "no";
    }
}
