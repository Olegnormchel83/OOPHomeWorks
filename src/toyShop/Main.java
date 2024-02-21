package toyShop;

import java.util.*;

public class Main {
    static DropMachine dropMachine;
    static Random random;
    static List<String> toyNames;

    public static void main(String[] args) {
        init();
        Queue<Toy> toyCollection = new PriorityQueue<>(10, dropChanceComparator);
        addDataToQueue(toyCollection);

        pollDataFromQueue(toyCollection);

    }

    private static void init() {
        dropMachine = new DropMachine();
        random = new Random();
        toyNames = new ArrayList<>(Arrays.asList("Конструктор", "Кукла", "Робот"));
    }

    public static Comparator<Toy> dropChanceComparator = new Comparator<Toy>() {
        @Override
        public int compare(Toy o1, Toy o2) {
            return Math.max(o1.getDropPercent(), o2.getDropPercent());
            //todo : Подумать, а точно ли ретернется то, что нужно))0
        }
    };

    private static void addDataToQueue(Queue<Toy> toys) {
        for (int i = 0; i < 3; i++) {
            toys.add(new Toy(i + 1, toyNames.get(random.nextInt(toyNames.size())), random.nextInt(100)));
        }
    }

    private static void pollDataFromQueue(Queue<Toy> toys) { //todo : Прописать логику дропа игрушек исходя из их вероятности выпадения
        for (int i = 0; i < 10; i++) {
            Toy toy = toys.peek();
            if (toy == null) break;
            System.out.println(STR."Выпала игрушка: \{toy.toString()}");
        }
    }
}
