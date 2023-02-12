package hexlet.code.game;

public interface Game {
    String getDescription();
    String getQuestion();
    String getRightAnswer(String question) throws Exception;
}
