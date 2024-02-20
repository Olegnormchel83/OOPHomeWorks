package HomeWorks.HW7.view;

import HomeWorks.HW7.UserInputSystem;
import HomeWorks.HW7.controller.CalcController;
import HomeWorks.HW7.model.Calc.ComplexNumber;

public class CalcView {
    private final CalcController<ComplexNumber> calcController;
    private final UserInputSystem userInputSystem;

    public CalcView(CalcController<ComplexNumber> calcController, UserInputSystem userInputSystem) {
        this.calcController = calcController;
        this.userInputSystem = userInputSystem;
    }

    private void Awake() {
        double aReal = userInputSystem.prompt("Enter the real number A: ");
        double aImg = userInputSystem.prompt("Enter the imaginary number A: ");
        String operator = userInputSystem.getOperator();
        double bReal = userInputSystem.prompt("Enter the real number B: ");
        double bImg = userInputSystem.prompt("Enter the imaginary number B: ");

        ComplexNumber real = new ComplexNumber(aReal, aImg);
        ComplexNumber imaginary = new ComplexNumber(bReal, bImg);
        ComplexNumber result;

        switch (operator) {
            case "+":
                result = calcController.summarize(real, imaginary);
                System.out.println(STR."Result = \{result.toString()}");
                break;
            case "-":
                result = calcController.subtract(real, imaginary);
                System.out.println(STR."Result = \{result.toString()}");
                break;
            case "*":
                result = calcController.multiply(real, imaginary);
                System.out.println(STR."Result = \{result.toString()}");
                break;
            case "/":
                result = calcController.divide(real, imaginary);
                System.out.println(STR."Result = \{result.toString()}");
                break;
            default:
                System.out.println("Invalid operator. Try again.");
        }
    }

    public void Start() {
        while(true) {
            String action = userInputSystem.prompt();
            if (action.equals("q")) {
                System.exit(0);
            } else {
                Awake();
            }
        }
    }


}
