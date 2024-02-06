package Seminars.Sem3.BullsAndCows;

public class Answer {
    private Integer cowCounter;
    private Integer bullCounter;
    private Integer tryCounter;


    public Answer(Integer cowCounter, Integer bullCounter, Integer tryCounter) {
        this.cowCounter = cowCounter;
        this.bullCounter = bullCounter;
        this.tryCounter = tryCounter;
    }

    @Override
    public String toString() {
        return String.format("Вы угадали:\n" +
                "Коров: %d\n" +
                "Быков: %d\n" +
                "Оставшиеся попытки: %d", cowCounter, bullCounter, tryCounter);
    }
}
