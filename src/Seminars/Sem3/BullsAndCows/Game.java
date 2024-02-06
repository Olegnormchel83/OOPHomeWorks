package Seminars.Sem3.BullsAndCows;

public interface Game {
    void start(String language, Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();

    String getWord();
}
