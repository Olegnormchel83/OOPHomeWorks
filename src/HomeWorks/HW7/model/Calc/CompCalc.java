package HomeWorks.HW7.model.Calc;

public class CompCalc implements ICalculator<ComplexNumber> {

    @Override
    public ComplexNumber summarize(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    @Override
    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() - b.getReal(), a.getImaginary() - b.getImaginary());
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary(),
                            a.getReal() * b.getImaginary() - a.getImaginary() * b.getReal());
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double denominator = Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2);
        if (denominator == 0) return null;
        else return new ComplexNumber((a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator,
                                (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator);
    }
}
