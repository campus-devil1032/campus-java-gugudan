package project_0504;

public class Calculator {
	private int op1, op2; // operand1, operand2
	private String op; // operator
	double result = 0;
	
	public Calculator(int op1, String op, int op2) { 
		this.op1 = op1;
		this.op = op;
		this.op2 = op2;
	}
	
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	
	int sub(int x, int y) {
		int result = x - y;
		return result;
	}
	
	int mul(int x, int y) {
		int result = x * y;
		return result;
	}
	
	double div(double x, double y) {
		double result = x / y;
		return result;
	}
	
	public void calculate() {
		try {
			switch(op) {
			case "+":
				result = add(op1, op2);
				break;
			case "-":
				result = sub(op1, op2);
				break;
			case "*":
				result = mul(op1, op2);
				break;
			case "/":
				result = div(op1, op2);
				isInfiniteOrNan(result);
				break;
			default:
				System.out.println("유효하지 않은 입력입니다.\n");
				}
			
			if(!(op.equals("/"))) {
				System.out.printf("%d %s %d = %d\n", op1, op, op2, (int)result);
			}else {
				System.out.printf("%d %s %d = %.2f\n", op1, op, op2, result);
			}
		}catch (InputOutOfBoundsException e) { // 0으로 나눴을 때 발생
			System.out.println("0으로 나눌 수 없습니다.\n");
		}catch (NumberFormatException e) {
			System.out.println("유효하지 않은 입력입니다.\n");
		}
	}
	
	public static void isInfiniteOrNan(double result) throws InputOutOfBoundsException {
		if(Double.isInfinite(result) || Double.isNaN(result)) {
			throw new InputOutOfBoundsException();
		}
	}	
}