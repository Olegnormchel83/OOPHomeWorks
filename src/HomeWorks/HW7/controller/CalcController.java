package HomeWorks.HW7.controller;

import HomeWorks.HW7.model.Calc.ComplexNumber;
import HomeWorks.HW7.model.Calc.ICalculator;
import HomeWorks.HW7.model.Logger.Logger;


public class CalcController<E> {
    private ICalculator<ComplexNumber> calculator;
    private Logger logger;

    public CalcController(ICalculator<ComplexNumber> calculator) {
        this.calculator = calculator;
        logger = new Logger();
    }

    public ComplexNumber summarize(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.summarize(a, b);
        logger.log(STR."Sum of complex numbers \{a.toString()} and \{b.toString()} = \{result}");
        return result;
    }

    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.subtract(a, b);
        logger.log(STR."Difference of complex numbers \{a.toString()} and \{b.toString()} = \{result}");
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.multiply(a, b);
        logger.log(STR."Product of complex numbers \{a.toString()} and \{b.toString()} = \{result}");
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = calculator.divide(a, b);
        logger.log(STR."Quotient of complex numbers \{a.toString()} and \{b.toString()} = \{result}");
        return result;
    }
}
