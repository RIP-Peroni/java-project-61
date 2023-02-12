package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public final class Even implements Game {
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int MAX_RANDOM_NUMBER = 100;
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static void startGame() throws Exception {
        GameEngine.launchEngine(new Even());
    }
    public String getQuestion() {
        int randomNumber = Util.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        return String.valueOf(randomNumber);
    }

    public String getRightAnswer(String question) {
        return Util.isEven(Integer.parseInt(question)) ? "yes" : "no";
    }
}
