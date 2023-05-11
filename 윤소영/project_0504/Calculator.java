package project_0504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Calculator {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private String exp;
	private int op1, op2; // operand1, operand2
	private String op; // operator
	private double result = 0;

	public Calculator() {}
	
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
	
	public void calculate() throws IOException {
		while (true) {
			System.out.print("\n연산식을 입력하세요. (ex. 1 + 2)\n(0 입력 시 계산기 종료)\n> ");
			exp = br.readLine();
			if(exp.equals("0")) {
				System.out.println();
				break;
			}
			try{
				StringTokenizer st = new StringTokenizer(exp);
				this.op1 = Integer.parseInt(st.nextToken());
				this.op = st.nextToken();
				this.op2 = Integer.parseInt(st.nextToken());
				
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
					System.out.println("유효하지 않은 입력입니다.");
					}
					
				if(!(op.equals("/"))) {
					System.out.printf("%d %s %d = %d\n", op1, op, op2, (int)result);
				}else {
					System.out.printf("%d %s %d = %.2f\n", op1, op, op2, result);
				}
			}catch (NoSuchElementException e) { // 연산자나 피연산자 미입력했을 때 발생
				System.out.println("연산식을 정확하게 입력하세요.");
			}catch (InputOutOfBoundsException e) { // 0으로 나눴을 때 발생
				System.out.println("0으로 나눌 수 없습니다.");
			}catch (NumberFormatException e) {
				System.out.println("유효하지 않은 입력입니다.");
			}
		}
	}
	
	public static void isInfiniteOrNan(double result) throws InputOutOfBoundsException {
		if(Double.isInfinite(result) || Double.isNaN(result)) {
			throw new InputOutOfBoundsException();
		}
	}	
}