package project_0504;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Calculator {
	
	private int op1, op2;
	private String op;
	double result = 0;

	public Calculator() {}
	
	public void calculate(String exp) {
		
		StringTokenizer st = new StringTokenizer(exp);
		while(st.hasMoreTokens()){
			op1 = Integer.parseInt(st.nextToken()); //operand1
			op = st.nextToken(); //operator
			op2 = Integer.parseInt(st.nextToken()); //operand2
		}
		
		try {
			switch(op) {
			case "+":
				result = op1 + op2;
				break;
			case "-":
				result = op1 - op2;
				break;
			case "*":
				result = op1 * op2;
				break;
			case "/":
				// 소수점까지 표시하기 위해 double로 강제 형 변환 후 계산
				result = (double)op1 / (double)op2; 
				isInfiniteOrNan((double)result);
				break;
			default:
				System.out.println("유효하지 않은 입력입니다.\n");
				}
			if(!(op.equals("/"))) {
				System.out.printf("%d %s %d = %d\n\n", op1, op, op2, (int)result);
			}else {
				System.out.printf("%d %s %d = %.2f\n\n", op1, op, op2, result);
			}
		}catch (InputOutOfBoundsException e) { // 0으로 나눴을 시 발생
			System.out.println("유효하지 않은 입력입니다.\n");
		}catch (NumberFormatException e) {
			System.out.println("유효하지 않은 입력입니다.\n");
		}catch (NoSuchElementException e) { // 연산자나 피연산자 미입력 시 발생
			System.out.println("유효하지 않은 입력입니다.\n");
		}
	}
	
	public static void isInfiniteOrNan(double result) throws InputOutOfBoundsException {
		if(Double.isInfinite(result) || Double.isNaN(result)) {
			throw new InputOutOfBoundsException();
		}
	}
}

class InputOutOfBoundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}