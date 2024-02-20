package HomeWorks.HW7;

import HomeWorks.HW7.controller.CalcController;
import HomeWorks.HW7.model.Calc.CompCalc;
import HomeWorks.HW7.model.Calc.ComplexNumber;
import HomeWorks.HW7.model.Calc.ICalculator;
import HomeWorks.HW7.view.CalcView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ICalculator<ComplexNumber> calc = new CompCalc();
        CalcController<ComplexNumber> calcController = new CalcController<>(calc);

        CalcView calcView = new CalcView(calcController, new UserInputSystem(new Scanner(System.in)));
        calcView.Start();
    }
}
