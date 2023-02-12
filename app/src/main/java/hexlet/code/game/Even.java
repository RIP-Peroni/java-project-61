package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public class Even implements Game {
    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static void startGame() {
        GameEngine.launchEngine(new Even());
    }
    public String getQuestion() {
        int min = 1;
        int max = 100;
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return String.valueOf(randomNumber);
    }

    public String getRightAnswer(String question) {
        return Util.isEven(Integer.parseInt(question)) ? "yes" : "no";
    }
}
