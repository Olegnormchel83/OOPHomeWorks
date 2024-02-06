package Seminars.Sem3.BullsAndCows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RUGame extends AbstractGame {

    List<String> wordsThreeLettersRU = new ArrayList<>(Arrays.asList("Кум", "Лак", "Сэр"));
    List<String> wordsFourLettersRU = new ArrayList<>(Arrays.asList("Рука", "Стоп", "Кино", "Река"));
    List<String> wordsFiveLettersRU = new ArrayList<>(Arrays.asList("Хутор", "Лампа", "Палка", "Пятно"));
    List<String> wordsSixLettersRU = new ArrayList<>(Arrays.asList("Индекс", "Тренер", "Усилие", "Оценка"));
    List<String> wordsSevenLettersRU = new ArrayList<>(Arrays.asList("Система", "Ноутбук", "Переход", "Подъезд"));
    List<String> wordsEightLettersRU = new ArrayList<>(Arrays.asList("Практика", "Аварийка", "Единство", "Заварщик"));
    List<String> wordsNineLettersRU = new ArrayList<>(Arrays.asList("Абонемент", "Гикбрейнс", "Газировка", "Дарование"));

    public String getWordThreeLetters() {
        Random rnd = new Random();
        String selectedWord = wordsThreeLettersRU.get(rnd.nextInt(0, wordsThreeLettersRU.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordFourLetters() {
        Random rnd = new Random();
        String selectedWord = wordsFourLettersRU.get(rnd.nextInt(0, wordsFourLettersRU.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordFiveLetters() {
        Random rnd = new Random();
        String selectedWord = wordsFiveLettersRU.get(rnd.nextInt(0, wordsFiveLettersRU.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordSixLetters() {
        Random rnd = new Random();
        String selectedWord = wordsSixLettersRU.get(rnd.nextInt(0, wordsSixLettersRU.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordSevenLetters() {
        Random rnd = new Random();
        String selectedWord = wordsSevenLettersRU.get(rnd.nextInt(0, wordsSevenLettersRU.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordEightLetters() {
        Random rnd = new Random();
        String selectedWord = wordsEightLettersRU.get(rnd.nextInt(0, wordsEightLettersRU.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    public String getWordNineLetters() {
        Random rnd = new Random();
        String selectedWord = wordsNineLettersRU.get(rnd.nextInt(0, wordsNineLettersRU.size()));
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < selectedWord.length(); i++) {
            word.append(selectedWord.charAt(i));
        }

        return word.toString();
    }

    @Override
    public void getStatistic(int tries, List<String> userInputs, String word) {
        for (int i = 0; i < userInputs.size(); i++) {
            System.out.println(i + 1 + " попытка: " + userInputs.get(i) + ". Загаднное слово: " + word);
        }
    }
}
