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
		System.out.println("���ϴ� ������ �Է����ּ��� [+ - * / %]");
		while (true) { // �����ڸ� �Է¹ް� ������ ��������.
			try {
				operator = br.readLine();
			} catch (IOException e) {
				operator = "";
				System.out.println("IOException!");
			}
			switch (operator) { // ����ġ�� ����� �Լ������� ���������� return ���
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
			System.out.println("�����ڰ� �ƴմϴ�. �ٽ��Է����ּ���.");
		}
	}

	private float getNum() {
		System.out.println("�Ǽ��� �Է����ּ���");
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
				System.out.println("�Ǽ��� �ƴմϴ�, �ٽ� �Է����ּ���");
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
