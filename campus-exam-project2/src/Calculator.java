import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	private BufferedReader br;
	private float numFirst, numSecond;

	public Calculator() {
		br = new BufferedReader(new InputStreamReader(System.in));
		numFirst = getNum();
		numSecond = getNum();

		calc();
	}

	private void calc() {
		String operator;
		System.out.println("원하는 연산을 입력해주세요 [+ - * / %]");
		while (true) { // 연산자를 입력받고 연산을 수행해줌.
			try {
				operator = br.readLine();
			} catch (IOException e) {
				operator = "";
				System.out.println("IOException!");
			}
			switch (operator) { // 스위치문 종료시 함수밖으로 나가기위해 return 사용
			case "+":
				System.out.printf("%f %s %f = %f\n", numFirst, operator, numSecond, numFirst + numSecond);
				return;
			case "-":
				System.out.printf("%f %s %f = %f\n", numFirst, operator, numSecond, numFirst - numSecond);
				return;
			case "*":
				System.out.printf("%f %s %f = %f\n", numFirst, operator, numSecond, numFirst * numSecond);
				return;
			case "/":
				System.out.printf("%f %s %f = %f\n", numFirst, operator, numSecond, numFirst/ numSecond);
				return;
			case "%":
				System.out.printf("%f %s %f = %f\n", numFirst, operator, numSecond, numFirst % numSecond);
				return;
			}
			System.out.println("연산자가 아닙니다. 다시입력해주세요.");
		}
	}

	private float getNum() {
		System.out.println("실수를 입력해주세요");
		String str;
		try {
			str = br.readLine();
		} catch (IOException e) {
			str = "-";
			System.out.println("IOException!");
		}
		while (true) {
			if (checkNumber(str)) {
				return Float.parseFloat(str);
			} else {
				System.out.println("실수가 아닙니다, 다시 입력해주세요");
			}
		}
	}

	private boolean checkNumber(String s) {
		try {
			Float.parseFloat(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
