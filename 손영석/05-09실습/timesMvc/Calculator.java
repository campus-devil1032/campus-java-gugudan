package timesMvc;

// 계산기 클래스
public class Calculator {
	static TimesTableController controller = new TimesTableController();
	static TimesTableModel model = new TimesTableModel();

	static void calc() {
		String operator; // 연산자
		String num1; // 첫번째 입력값
		String num2; // 두번째 입력값

		while (true) {
			try {
				System.out.println("<첫 번째 숫자를 입력하세요>");
				System.out.println("(메뉴 화면: X 입력)");
				num1 = controller.getInput();

				// X 입력시 종료(1)
				if (num1.equals("x") || num1.equals("X")) {
					System.out.println("메뉴 화면으로 돌아갑니다.");
					break;
				}

				System.out.println("<연산자를 입력하세요(+, -, *, /, %)>");
				operator = controller.getInput();

				// X 입력시 종료(2)
				if (operator.equals("x") || operator.equals("X")) {
					System.out.println("메뉴 화면으로 돌아갑니다.");
					break;
				}

				System.out.println("<두 번째 숫자를 입력하세요>");
				num2 = controller.getInput();

				// X 입력시 종료(3)
				if (num2.equals("x") || num2.equals("X")) {
					System.out.println("메뉴 화면으로 돌아갑니다.");
					break;
				}

				// 입력값 출력
				System.out.println("====================");
				model.calculate(operator, Double.parseDouble(num1), Double.parseDouble(num2));
				System.out.println("====================");

			} catch (NumberFormatException e) { // 자료형 불일치 시
				System.err.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}
		}
	}

}
