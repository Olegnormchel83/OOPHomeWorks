package Seminars.Sem3.BullsAndCows;

import java.util.List;
import java.util.Random;

public class NumberGame extends AbstractGame {
    public String generateCharList(Integer sizeWord) {
        Random rnd = new Random();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < sizeWord; i++) {
            word.append(rnd.nextInt(0, 9));
        }

        return word.toString();
    }

    @Override
    public void getStatistic(int tries, List<String> userInputs, String word) {
        for (int i = 0; i < userInputs.size(); i++) {
            System.out.println(i + 1 + " попытка: " + userInputs.get(i) + ". Загаднное число: " + word);
        }
    }
}
