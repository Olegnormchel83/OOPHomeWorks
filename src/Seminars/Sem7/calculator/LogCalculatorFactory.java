package Seminars.Sem7.calculator;

public class LogCalculatorFactory implements ICalculableFactory{
    Logable logable;
    public LogCalculatorFactory(Logable logable) {
        this.logable = logable;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logable);
    }
}
