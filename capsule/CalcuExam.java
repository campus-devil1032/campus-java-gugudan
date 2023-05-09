package two_week_project;

public class CalcuExam {
	private int num1, num2;
	private char operator;

	// 생성자를 통해서 필수값 입력
	public CalcuExam(int num1, int num2, char operaiton) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operaiton;
	}

	// 산수 연산자 확인 작업
	public void validatOperator() throws UserExcpetion {
		if (this.operator == '+' || this.operator == '-' || this.operator == '*' || this.operator == '/') {
		} else {
			throw new UserExcpetion();
		}
	}
	// 
	public void show() {
		switch (this.operator) {
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
