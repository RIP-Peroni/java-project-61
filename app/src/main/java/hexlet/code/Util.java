package hexlet.code;

public class Util {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int getRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
    public static int calculateGcd(int a, int b) {
        int[] operands = {a, b};
        while (operands[0] != 0 && operands[1] != 0) {
            if (operands[0] > operands[1]) {
                operands[0] %= operands[1];
            } else {
                operands[1] %= operands[0];
            }
        }
        return operands[0] + operands[1];
    }
}
