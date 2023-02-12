package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public final class Calc implements Game {
    private final String[] operators = {"+", "-", "*"};
    public static final int MIN_RANDOM_NUMBER = 0;
    public static final int MAX_RANDOM_NUMBER = 100;
    public String getDescription() {
        return "What is the result of the expression?";
    }
    public static void startGame() throws Exception {
        GameEngine.launchEngine(new Calc());
    }
    public String getQuestion() {
        int randomNumber1 = Util.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        int randomNumber2 = Util.getRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        String mathSign = operators[Util.getRandomNumber(0, operators.length - 1)];
        return randomNumber1 + " " + mathSign + " " + randomNumber2;
    }

    public String getRightAnswer(String question) throws Exception {
        String[] data = question.split(" ");
        int operand1 = Integer.parseInt(data[0]);
        int operand2 = Integer.parseInt(data[2]);
        String operator = data[1];
        switch (operator) {
            case "+" -> {
                return String.valueOf(operand1 + operand2);
            }
            case "-" -> {
                return String.valueOf(operand1 - operand2);
            }
            case "*" -> {
                return String.valueOf(operand1 * operand2);
            }
            default -> throw new Exception("Invalid operator!");
        }
    }
}
