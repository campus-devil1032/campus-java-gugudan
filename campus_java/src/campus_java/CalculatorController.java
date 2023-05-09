package campus_java;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void calculate() {
        double num1 = view.getNumber();
        double num2 = view.getNumber();
        char operator = view.getOperator();

        switch (operator) {
            case '+':
                model.add(num1, num2);
                break;
            case '-':
                model.subtract(num1, num2);
                break;
            case '*':
                model.multiply(num1, num2);
                break;
            case '/':
                model.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        view.showResult(model.getResult());
    }
}
