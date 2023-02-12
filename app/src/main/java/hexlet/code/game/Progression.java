package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public final class Progression implements Game {
    private int concealedElement;
    public String getDescription() {
        return "What number is missing in the progression?";
    }
    public static void startGame() throws Exception {
        GameEngine.launchEngine(new Progression());
    }
    public String getQuestion() {
        int minLengthOfProgression = 5;
        int maxLengthOfProgression = 10;
        int elementsCount = Util.getRandomNumber(minLengthOfProgression, maxLengthOfProgression);
        StringBuilder progression = new StringBuilder(elementsCount);
        int concealedIndex = Util.getRandomNumber(0, elementsCount - 1);
        int maxRandom = 100;
        int start = Util.getRandomNumber(0, maxRandom);
        int maxDiff = 10;
        int diff = Util.getRandomNumber(1, maxDiff);
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
