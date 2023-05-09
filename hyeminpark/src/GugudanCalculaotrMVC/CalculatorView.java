package GugudanCalculaotrMVC;

import java.util.Scanner;

public class CalculatorView {
	private Scanner scanner;

	public CalculatorView() {
		scanner = new Scanner(System.in);
	}

	public double getInputNum1() {
		System.out.println("첫 번째 숫자를 입력하세요: ");
		return getInput();
	}
	
	public String getInputOperator() {
		System.out.println("연산자를 입력하세요: ");
		String operator = scanner.next();

		while (!isValidOperator(operator)) {
				System.out.println("잘못 입력했습니다. 연산자를 [+, -, *, /] 중에서 다시 입력하세요: ");
				operator = scanner.next();
			}
		return operator;
	}
	
	public double getInputNum2() {
		System.out.println("두 번째 숫자를 입력하세요: ");
		return getInput();
	}
	
	public void printResult(double result) {
		System.out.println("계산 결과: " + result);
	}
	
	private boolean isValidOperator(String operator) {
		return operator.equals("+")
				|| operator.equals("-")
				|| operator.equals("*")
				|| operator.equals("/");
	}
	
	private double getInput() {
		while(true) {
			try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.out.print("잘못 입력했습니다. 숫자를 다시 입력하세요.");
            }
		}
	}

}
