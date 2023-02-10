package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
    public static void playEvenGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int min = 1;
        int max = 100;
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String question = String.valueOf(randomNumber);
        String rightAnswer = Util.isEven(randomNumber) ? "yes" : "no";

        int countRounds = 3;
        for (int i = 0; i < countRounds; i++) {
            System.out.println("Question: " + question);
//            System.out.print();
        }

        scanner.close();
    }
}
