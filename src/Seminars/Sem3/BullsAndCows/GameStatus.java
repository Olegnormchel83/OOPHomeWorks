package Seminars.Sem3.BullsAndCows;

public enum GameStatus {
    INIT, START, LOSE("Вы проиграли!("), WIN("Вы выиграли!)");

    private String descriptions;

    GameStatus(String descriptions) {
        this.descriptions = descriptions;
    }

    GameStatus() {
    }

    public String getDescriptions() {
        return descriptions;
    }
}
