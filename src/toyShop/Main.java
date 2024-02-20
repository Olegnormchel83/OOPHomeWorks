package toyShop;

public class Main {
    static DropMachine dropMachine;
    public static void main(String[] args) {
        init();
        Toy constructor = new Toy(1, "Конструктор", 20);
        Toy robot = new Toy(2, "Робот", 20);
        Toy doll = new Toy(3, "Кукла", 60);
        dropMachine.addToy(constructor);
        dropMachine.addToy(robot);
        dropMachine.addToy(doll);

    }

    private static void init() {
        dropMachine = new DropMachine();
    }
}
