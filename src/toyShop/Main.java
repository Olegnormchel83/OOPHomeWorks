package toyShop;

import java.io.IOException;
import java.util.*;

public class Main {
    static DropMachine dropMachine;
    static Random random;
    static List<String> toyNames;

    public static void main(String[] args) throws IOException {
        init();
        dropMachine.createQueue();
        dropMachine.drop(10);
    }

    private static void init() {
        dropMachine = new DropMachine();
        random = new Random();
        toyNames = new ArrayList<>(Arrays.asList("Конструктор", "Кукла", "Робот"));
    }
}
