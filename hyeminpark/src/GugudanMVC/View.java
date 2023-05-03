package GugudanMVC;

import java.util.Scanner;

public class View {

	private Controller controller;
	private Scanner scanner;
	
	public View(Controller controller) {
		this.controller = controller;
		this.scanner = new Scanner(System.in);
	}
	
	public void run() {
		int num = 0;
		boolean isValidInput = false;
		while(!isValidInput) {
			System.out.println("����� �������� �� ���� �Է��ϼ���: ");
			try {
				String input = scanner.nextLine();
				num = Integer.parseInt(input);
				if (num < 1 || num > 999) {
					throw new NumberFormatException();
				}
				isValidInput = true;
			} catch (NumberFormatException e) {
				System.out.println("1~999 ������ ���� ��ȿ�մϴ�.");
			}
		}
		controller.showTable(num);
	}
	
	public void displayTable(String table) {
		System.out.println(table);
	}

}
