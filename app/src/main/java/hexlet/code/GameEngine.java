package hexlet.code;

import hexlet.code.game.Game;

import java.util.Scanner;

public class GameEngine {
    public static final int COUNT_ROUNDS = 3;
    public static void launchEngine(Game game) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(game.getDescription());

        for (int i = 0; i < COUNT_ROUNDS; i++) {
            String question = game.getQuestion();
            String rightAnswer = game.getRightAnswer(question);

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");

        scanner.close();
    }
}
