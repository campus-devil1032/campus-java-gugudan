package GugudanCalculaotrMVC;

import java.util.Scanner;

public class CalculatorView {
	private Scanner scanner;

	public CalculatorView() {
		scanner = new Scanner(System.in);
	}
	
	// ù ��° ���� �Է�
	public double getInputNum1() {
		System.out.println("ù ��° ���ڸ� �Է��ϼ���: ");
		return getInput();
	}
	
	// ������ �Է�
	public String getInputOperator() {
		System.out.println("�����ڸ� �Է��ϼ���: ");
		String operator = scanner.next();

		while (!isValidOperator(operator)) {
				System.out.println("�߸� �Է��߽��ϴ�. �����ڸ� [+, -, *, /] �߿��� �ٽ� �Է��ϼ���: ");
				operator = scanner.next();
			}
		return operator;
	}
	
	// �� ��° ���� �Է�
	public double getInputNum2() {
		System.out.println("�� ��° ���ڸ� �Է��ϼ���: ");
		return getInput();
	}
	
	// ��� ����� ���
	public void printResult(double result) {
		System.out.println("��� ���: " + result);
	}
	
	// ��ȿ ������ �˻�
	private boolean isValidOperator(String operator) {
		return operator.equals("+")
				|| operator.equals("-")
				|| operator.equals("*")
				|| operator.equals("/");
	}
	
	// ���� �Է� �� �˻�
	private double getInput() {
		while(true) {
			try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.out.print("�߸� �Է��߽��ϴ�. ���ڸ� �ٽ� �Է��ϼ���.");
            }
		}
	}

}
