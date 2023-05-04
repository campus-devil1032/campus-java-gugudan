package view;

public class CalculatorView {
    public void printEnterOperandMessage(int operandIndex) {
        System.out.printf("Enter operand%d: ", operandIndex);
    }

    public void printEnterOperatorMessage() {
        System.out.print("Enter operator (+, -, *, /): ");
    }

    public void printCalculationResult(double result) {
        System.out.printf("결과: %.2f\n", result);
    }

    public void printContinueOrExitMessage() {
        System.out.print("계속하시겠습니까? (종료를 원하시면 \"exit\" 을 입력해주세요.): ");
    }

    public void printErrorMessage(String message) {
        System.out.printf(message+"\n");
    }
}

