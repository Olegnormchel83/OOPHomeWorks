package Seminars.Sem3.Fruits;

public class Main {
    public static void main(String[] args) {

        Fruits fruit = Fruits.BANANA;

        switch (fruit) {
            case APPLE:
                System.out.println("Это яблоко");
                break;
            case BANANA:
                System.out.println("Это банан");
                break;
            case ORANGE:
                System.out.println("Это апельсин");
                break;
        }
    }
}
