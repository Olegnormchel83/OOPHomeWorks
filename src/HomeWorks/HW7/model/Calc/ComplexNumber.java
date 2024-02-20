package HomeWorks.HW7.model.Calc;

import lombok.Getter;

@Getter
public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber() {
        this(0, 0);
    }

    @Override
    public String toString() {
        return STR."(\{real}, \{imaginary})";
    }
}
