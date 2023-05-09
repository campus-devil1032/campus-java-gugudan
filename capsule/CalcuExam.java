package two_week_project;

public class CalcuExam {
	private int num1, num2;
	private char operator;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) throws UserExcpetion {
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
			this.operator = operator;
		} else {
			throw new UserExcpetion();
		}
	}

	public void show(char key) {
		switch (key) {
		case '+':
			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
			break;
		case '-':
			System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
			break;
		case '*':
			System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
			break;
		case '/':
			System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
			break;
		}
	}

}
