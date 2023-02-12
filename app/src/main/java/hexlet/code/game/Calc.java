package hexlet.code.game;

import hexlet.code.GameEngine;
import hexlet.code.Util;

public final class Calc implements Game {
    String[] operators = {"+", "-", "*"};
    public String getDescription() {
        return "What is the result of the expression?";
    }
    public static void startGame() throws Exception {
        GameEngine.launchEngine(new Calc());
    }
    public String getQuestion() {
        int minRandom = 1;
        int maxRandom = 100;
        int randomNumber1 = Util.getRandomNumber(minRandom, maxRandom);
        int randomNumber2 = Util.getRandomNumber(minRandom, maxRandom);
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
