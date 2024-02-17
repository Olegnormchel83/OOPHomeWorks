package Seminars.Sem7.calculator;

public class LogCalculator implements Calculable {
    Logable logable;
    Calculable calculable;

    public LogCalculator(Calculator calculator, Logable logable) {
        calculable = calculator;
        this.logable = logable;
    }

    @Override
    public Calculable sum(int arg) {
        logable.log("Вызвался метод sum с параметром " + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logable.log("Вызвался метод multi с параметром " + arg);
        return calculable.multi(arg);
    }

    @Override
    public int getResult() {
        logable.log("Пользователь запросил результат");
        return calculable.getResult();
    }
}
