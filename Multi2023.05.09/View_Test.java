package mvc111;

import java.util.Scanner;

//view - ����� ���
public class View_Test {
	public static void main(String[] args) {
		Model_Test model_Test = new Model_Test();
		// Controller_Test controller_Test = new Controller_Test();
		int number;
		System.out.println("###################");
		System.out.println("���� �Է����ּ���");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			number = scanner.nextInt();
			model_Test.setNum(number);
			model_Test.showTable(number);
			System.out.println("###################");
			System.out.println("�߰� ���� �Է����ּ���");
		}
	}
}
