package toyShop;

import java.io.IOException;
import java.util.*;

public class Main {
    static DropMachine dropMachine;

    public static void main(String[] args) throws IOException {
        init();
        dropMachine.createQueue();
        dropMachine.drop(10);
    }

    private static void init() {
        dropMachine = new DropMachine();
    }
}
