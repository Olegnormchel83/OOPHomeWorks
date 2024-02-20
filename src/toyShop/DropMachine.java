package toyShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DropMachine {

    private List<Toy> toyCollection = new ArrayList<>();

    public DropMachine() {
    }

    public void dropToys(int countToys) {

    }

    public void addToy(Toy toy) {
        toyCollection.add(toy);
    }

    public List<Toy> getAllToys() {
        return toyCollection;
    }
}
