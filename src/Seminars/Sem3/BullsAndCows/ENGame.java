package Seminars.Sem3.BullsAndCows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ENGame extends AbstractGame {
    List<String> wordsThreeLettersEN = new ArrayList<>(Arrays.asList("cat", "dog", "pie"));
    List<String> wordsFourLettersEN = new ArrayList<>(Arrays.asList("cute", "boss", "rave", "rage"));
    List<String> wordsFiveLettersEN = new ArrayList<>(Arrays.asList("green", "brake", "again", "baler"));
    List<String> wordsSixLettersEN = new ArrayList<>(Arrays.asList("artist", "barber", "junior", "battle"));
    List<String> wordsSevenLettersEN = new ArrayList<>(Arrays.asList("citadel", "compact", "diamond", "ferrari"));
    List<String> wordsEightLettersEN = new ArrayList<>(Arrays.asList("accident", "betrayal", "blizzard", "catalyst"));
    List<String> wordsNineLettersEN = new ArrayList<>(Arrays.asList("activator", "alchemist", "birdhouse", "brutality"));

    @Override
    public void getStatistic(int tries, List<String> userInputs, String word) {
        for (int i = 0; i < userInputs.size(); i++) {
            System.out.println(i + 1 + " попытка: " + userInputs.get(i) + ". Загаднное слово: " + word);
        }
    }

    public String getWordThreeLetters() {
        Random rnd = new Random();
        String selectedWord = wordsThreeLettersEN.get(rnd.nextInt(0, wordsThreeLettersEN.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordFourLetters() {
        Random rnd = new Random();
        String selectedWord = wordsFourLettersEN.get(rnd.nextInt(0, wordsFourLettersEN.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordFiveLetters() {
        Random rnd = new Random();
        String selectedWord = wordsFiveLettersEN.get(rnd.nextInt(0, wordsFiveLettersEN.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordSixLetters() {
        Random rnd = new Random();
        String selectedWord = wordsSixLettersEN.get(rnd.nextInt(0, wordsSixLettersEN.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordSevenLetters() {
        Random rnd = new Random();
        String selectedWord = wordsSevenLettersEN.get(rnd.nextInt(0, wordsSevenLettersEN.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordEightLetters() {
        Random rnd = new Random();
        String selectedWord = wordsEightLettersEN.get(rnd.nextInt(0, wordsEightLettersEN.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordNineLetters() {
        Random rnd = new Random();
        String selectedWord = wordsNineLettersEN.get(rnd.nextInt(0, wordsNineLettersEN.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }
}
