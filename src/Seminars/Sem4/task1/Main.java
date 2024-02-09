package Seminars.Sem4.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("calc.composition(2.1, 3) = " + calc.composition(2.1, 3) + "\n");

        System.out.println("calc.division(25, 2.7) = " + calc.division(25, 2.7) + "\n");

        System.out.println("calc.binaryTranslation(8) = " + calc.binaryValue("12"));
    }
}
