package HomeWorks.HW7;

import java.util.Scanner;

public class UserInputSystem {
    private Scanner scanner;

    public UserInputSystem(Scanner scanner) {
        this.scanner = scanner;
    }

    public double prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();
    }

    public String prompt() {
        Scanner in = new Scanner(System.in);
        System.out.println("Press any key to continue\n" +
                           "Press q to exit");
        return in.nextLine();
    }

    public String getOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose an action (+, -, *, /): ");
        return scanner.nextLine();
    }
}
