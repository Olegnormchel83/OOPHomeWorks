package toyShop;

import lombok.Getter;

public class Toy {
    private int id;
    private String name;

    @Getter
    private int dropPercent;

    public Toy(int id, String name, int dropPercent) {
        this.id = id;
        this.name = name;
        this.dropPercent = dropPercent;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dropPercent=" + dropPercent +
                '}';
    }
}
