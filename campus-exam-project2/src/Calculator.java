import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	private BufferedReader br;
	private float a, b;

	public Calculator() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		a = getNum();
		b = getNum();

		calc();
	}

	private void calc() throws IOException {
		String c;
		System.out.println("원하는 연산을 입력해주세요 [+ - * / %]");
		while (true) {
			c = br.readLine();
			switch(c) { //스위치문 종료시 함수밖으로 나가기위해 return 사용
			case "+":
				System.out.printf("%f %s %f = %f\n", a, c, b, a + b);
				return;
			case "-":
				System.out.printf("%f %s %f = %f\n", a, c, b, a - b);
				return;
			case "*":
				System.out.printf("%f %s %f = %f\n", a, c, b, a * b);
				return;
			case "/":
				System.out.printf("%f %s %f = %f\n", a, c, b, a / b);
				return;
			case "%":
				System.out.printf("%f %s %f = %f\n", a, c, b, a % b);
				return;
			}
			System.out.println("연산자가 아닙니다. 다시입력해주세요.");
		}
	}

	private float getNum() throws IOException {
		System.out.println("실수를 입력해주세요");
		String str = br.readLine();
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
