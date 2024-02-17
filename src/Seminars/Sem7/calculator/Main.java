package Seminars.Sem7.calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculatorFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
