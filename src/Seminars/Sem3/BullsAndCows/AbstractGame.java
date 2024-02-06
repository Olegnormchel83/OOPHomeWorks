package Seminars.Sem3.BullsAndCows;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGame implements Game {

    private RUGame ruGame;
    private ENGame enGame;
    private NumberGame numberGame;
    private String word;
    private GameStatus gameStatus = GameStatus.INIT;
    private Integer maxTry;

    public String generateWord(String language, Integer sizeWord) {
        if (language.equals("RU")) {
            return switch (sizeWord) {
                case 3 -> ruGame.getWordThreeLetters();
                case 4 -> ruGame.getWordFourLetters();
                case 5 -> ruGame.getWordFiveLetters();
                case 6 -> ruGame.getWordSixLetters();
                case 7 -> ruGame.getWordSevenLetters();
                case 8 -> ruGame.getWordEightLetters();
                case 9 -> ruGame.getWordNineLetters();
                default -> null;
            };
        } else if (language.equals("EN")) {
            return switch (sizeWord) {
                case 3 -> enGame.getWordThreeLetters();
                case 4 -> enGame.getWordFourLetters();
                case 5 -> enGame.getWordFiveLetters();
                case 6 -> enGame.getWordSixLetters();
                case 7 -> enGame.getWordSevenLetters();
                case 8 -> enGame.getWordEightLetters();
                case 9 -> enGame.getWordNineLetters();
                default -> null;
            };
        }
        return numberGame.generateCharList(sizeWord);
    }

    public abstract void getStatistic(int tries, List<String> userInputs, String word);

    @Override
    public void start(String language, Integer sizeWord, Integer maxTry) {
        switch (language) {
            case "RU" -> this.ruGame = new RUGame();
            case "EN" -> this.enGame = new ENGame();
            case "NUM" -> this.numberGame = new NumberGame();
        }
        gameStatus = GameStatus.START;
        this.maxTry = maxTry;
        word = generateWord(language, sizeWord);
    }

    @Override
    public Answer inputValue(String value) {
        if (!getGameStatus().equals(GameStatus.START)) {
            throw new RuntimeException("Игра не в активном состоянии");
        }

        Integer cowCount = 0;
        Integer bullCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == value.charAt(i)) {
                bullCount++;
            }
            if (word.contains(String.valueOf(value.charAt(i)))) {
                cowCount++;
            }
        }

        --maxTry;

        if (bullCount.equals(word.length())) {
            gameStatus = GameStatus.WIN;
        } else if (maxTry == 0) {
            gameStatus = GameStatus.LOSE;
        }

        return new Answer(cowCount, bullCount, maxTry);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public String getWord() {
        return word;
    }
}
