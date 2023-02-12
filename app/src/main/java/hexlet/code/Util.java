package hexlet.code;

public class Util {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int getRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}
