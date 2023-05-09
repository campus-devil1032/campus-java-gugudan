package campus_java;
import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public double getNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public char getOperator() {
        System.out.print("Enter an operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void showResult(double result) {
        System.out.println("Result: " + result);
    }
}
