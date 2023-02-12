package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public final class Progression implements Game {
    public static final int MIN_LENGTH_OF_PROGRESSION = 5;
    public static final int MAX_LENGTH_OF_PROGRESSION = 10;
    public static final int MIN_RANDOM_NUMBER = 0;
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_DIFF = 1;
    public static final int MAX_DIFF = 10;
    private int concealedElement;
    public String getDescription() {
        return "What number is missing in the progression?";
    }
    public static void startGame() throws Exception {
        GameEngine.launchEngine(new Progression());
    }
    public String getQuestion() {
        int elementsCount = Util.getRandomNumber(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
        StringBuilder progression = new StringBuilder(elementsCount);
        int concealedIndex = Util.getRandomNumber(0, elementsCount - 1);
        int start = Util.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        int diff = Util.getRandomNumber(MIN_DIFF, MAX_DIFF);
        for (int i = 0; i < elementsCount; i++) {
            boolean isConcealed = i == concealedIndex;
            int newElement = start + diff * i;
            progression.append(isConcealed ? " .." : " " + newElement);
            if (isConcealed) {
                concealedElement = newElement;
            }
        }
        return progression.toString().trim();
    }

    public String getRightAnswer(String question) {
        return String.valueOf(concealedElement);
    }
}
