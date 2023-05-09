package GugudanCalculaotrMVC;

import java.util.Scanner;

public class CalculatorView {
	private Scanner scanner;

	public CalculatorView() {
		scanner = new Scanner(System.in);
	}
	
	// 첫 번째 숫자 입력
	public double getInputNum1() {
		System.out.println("첫 번째 숫자를 입력하세요: ");
		return getInput();
	}
	
	// 연산자 입력
	public String getInputOperator() {
		System.out.println("연산자를 입력하세요: ");
		String operator = scanner.next();

		while (!isValidOperator(operator)) {
				System.out.println("잘못 입력했습니다. 연산자를 [+, -, *, /] 중에서 다시 입력하세요: ");
				operator = scanner.next();
			}
		return operator;
	}
	
	// 두 번째 숫자 입력
	public double getInputNum2() {
		System.out.println("두 번째 숫자를 입력하세요: ");
		return getInput();
	}
	
	// 계산 결과값 출력
	public void printResult(double result) {
		System.out.println("계산 결과: " + result);
	}
	
	// 유효 연산자 검사
	private boolean isValidOperator(String operator) {
		return operator.equals("+")
				|| operator.equals("-")
				|| operator.equals("*")
				|| operator.equals("/");
	}
	
	// 숫자 입력 값 검사
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
