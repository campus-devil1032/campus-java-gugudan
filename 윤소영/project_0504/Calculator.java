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
				// �Ҽ������� ǥ���ϱ� ���� double�� ���� �� ��ȯ �� ���
				result = (double)op1 / (double)op2; 
				isInfiniteOrNan((double)result);
				break;
			default:
				System.out.println("��ȿ���� ���� �Է��Դϴ�.\n");
				}
			if(!(op.equals("/"))) {
				System.out.printf("%d %s %d = %d\n\n", op1, op, op2, (int)result);
			}else {
				System.out.printf("%d %s %d = %.2f\n\n", op1, op, op2, result);
			}
		}catch (InputOutOfBoundsException e) { // 0���� ������ �� �߻�
			System.out.println("��ȿ���� ���� �Է��Դϴ�.\n");
		}catch (NumberFormatException e) {
			System.out.println("��ȿ���� ���� �Է��Դϴ�.\n");
		}catch (NoSuchElementException e) { // �����ڳ� �ǿ����� ���Է� �� �߻�
			System.out.println("��ȿ���� ���� �Է��Դϴ�.\n");
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