package toyShop;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DropMachine {

    private final Queue<Toy> toyCollection = new PriorityQueue<>();

    public DropMachine() {
    }

    public void dropToys(int countToys) {

    }

    public void addToy(Toy toy) {
        toyCollection.add(toy);
    }

    public Queue<Toy> getAllToys() {
        return toyCollection;
    }
}
