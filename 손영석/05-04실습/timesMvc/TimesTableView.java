package timesMvc;

import java.util.InputMismatchException;

public class TimesTableView {
	static TimesTableController controller = new TimesTableController();
	static TimesTableModel model = new TimesTableModel();

	// 구구단
	public static void mul() {
		while (true) {
			try {
				// 숫자 입력받기
				System.out.println("<1~999 사이의 정수를 입력하세요>");
				System.out.println("(X 또는 숫자 0 입력시 종료)");
				String num = controller.getInput();

				// 구구단 계산하기
				if (num.equals("x") || num.equals("X") || Integer.parseInt(num) == 0) { // X 또는 0 입력 시 종료
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {
					model.multiplication(Integer.parseInt(num));
				}

			} catch (NumberFormatException e) { // 자료형 불일치 시
				System.err.println("잘못된 입력입니다. 프로그램을 종료합니다.");
				return;
			}
		}
	}

	// 계산기
	public static void calc() {
		while (true) {
			try {
				System.out.println("<첫 번째 숫자를 입력하세요>");
				System.out.println("(X 입력시 종료)");
				String num1 = controller.getInput();
				
				// X 입력시 종료(1)
				if (num1.equals("x") || num1.equals("X")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}

				System.out.println("<연산자를 입력하세요(+, -, *, /, %)>");
				String operator = controller.getInput();
				
				// X 입력시 종료(2)
				if (operator.equals("x") || operator.equals("X")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}

				System.out.println("<두 번째 숫자를 입력하세요>");
				String num2 = controller.getInput();
				
				// X 입력시 종료(3)
				if (num2.equals("x") || num2.equals("X")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}

				// 입력값 계산하기
				model.calculate(operator, Double.parseDouble(num1), Double.parseDouble(num2));

			} catch (NumberFormatException e) { // 자료형 불일치 시
				System.err.println("잘못된 입력입니다. 프로그램을 종료합니다.");
				return;
			}
		}
	}

	// 메인
	public static void main(String[] args) {

		controller.showMenu(); // 메뉴 표시

		try {
			int select = controller.getSelect();

			switch (select) {

			case 0: // 종료
				System.out.println("프로그램을 종료합니다.");
				break;

			case 1: // 구구단
				mul();
				break;

			case 2: // 계산기
				calc();
				break;

			default: // 다른 값 입력 시
				System.err.println("잘못된 입력입니다. 프로그램을 종료합니다.");
				break;
			}
		} catch (InputMismatchException e) { // 자료형 불일치 시
			System.err.println("잘못된 입력입니다. 프로그램을 종료합니다.");
			return;
		}
	}
}
