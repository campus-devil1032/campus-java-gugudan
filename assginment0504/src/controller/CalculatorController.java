package controller;

import model.CalculatorModel;
import view.CalculatorView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorController {
    private final CalculatorModel model;
    private final CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // 첫번째 피연산자 입력
                view.printEnterOperandMessage(1);
                double operand1 = scanner.nextDouble();
                model.setOperand1(operand1);

                // 연산자 입력
                view.printEnterOperatorMessage();
                String operator = scanner.next();
                model.setOperator(operator);

                // 두번째 피연산자 입력
                view.printEnterOperandMessage(2);
                double operand2 = scanner.nextDouble();
                model.setOperand2(operand2);

                // 결과 출력
                double result = model.calculate(); // 에러 처리는 calculate() 함수에서
                view.printCalculationResult(result);

                // 계산을 종료할 것인지 묻기, "exit" 입력 시 프로그램 종료, 아니라면 계속

                view.printContinueOrExitMessage();
                if (scanner.next().equals("exit")) {
                    scanner.close();
                    System.exit(0);
                }

            } catch (IllegalArgumentException e) {
                // 입력값이 잘못되었을 경우
                view.printErrorMessage("올바른 연산자를 입력해주세요 : IllegalArgumentException");
                scanner.nextLine();
            } catch (InputMismatchException e) {
                // 피연산자를 입력할 때 double 형식이 아닌 다른 형식의 값을 입력
                view.printErrorMessage("숫자를 입력해주세요 : InputMismatchException");
                scanner.nextLine();
            }
        }


    }
}
