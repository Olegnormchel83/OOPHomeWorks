package toyShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DropMachine {

    private List<Toy> toyCollection = new ArrayList<>();

    public DropMachine() {
    }

    public void dropToys(int countToys) {
        Random random = new Random();
        int toyDropPercent = 0;
        int randomDropChance = 0;
        Toy droppedToy;
        for (int i = 0; i < countToys; i++) {
            randomDropChance = random.nextInt(0, 100);
            for (Toy toy : toyCollection) {
                if (randomDropChance <= toy.getDropPercent()) {

                }
            }
        }
    }

    public void addToy(Toy toy) {
        toyCollection.add(toy);
    }

    public List<Toy> getAllToys() {
        return toyCollection;
    }
}
