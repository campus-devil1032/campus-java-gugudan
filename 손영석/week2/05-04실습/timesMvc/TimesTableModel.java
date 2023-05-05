package timesMvc;

public class TimesTableModel {

	// 구구단
	public void multiplication(int num) {

		if (num < 1 || num > 999) { // 입력범위제한
			System.err.println("1에서 999 사이의 정수가 아닙니다.");
			return;

		} else {
			System.out.println(num + "단을 출력합니다.");
			System.out.println("====================");

			for (int i = 1; i < 10; i++) { // 계산 후 출력
				System.out.println(num + " x " + i + " = " + (num * i));
			}
			System.out.println("====================");
		}
	}

	// 계산기
	public void calculate(String operator, double num1, double num2) {

		double result; // 결과값 변수

		if (operator.equals("+")) { // 덧셈
			result = num1 + num2;
		} else if (operator.equals("-")) { // 뺄셈
			result = num1 - num2;
		} else if (operator.equals("*")) { // 곱셈
			result = num1 * num2;
		} else if (operator.equals("/") && num1 != 0 && num2 != 0) { // 나눗셈
			result = num1 / num2;
		} else if (operator.equals("%") && num1 != 0 && num2 != 0) { // 나머지 구하기
			result = num1 % num2;
		} else { // 연산자 입력이 잘못된 경우
			System.err.println("연산자가 잘못되었습니다. 다시 입력하세요.");
			return;
		}
		// 결과값 출력
		System.out.println("====================");
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		System.out.println("====================");
	}

}
