package GugudanCalculaotrMVC;

import java.util.Scanner;

public class GugudanView {

	private GugudanController controller;
	private Scanner scanner;
	
	public GugudanView(GugudanController controller) {
		this.controller = controller;
		this.scanner = new Scanner(System.in);
	}
	
	public void run() {
		int num = 0;
		boolean isValidInput = false;
		
		// ������ �� �� �Է�
		while(!isValidInput) {
			System.out.println("����� �������� �� ���� �Է��ϼ���: ");
			try {
				String input = scanner.nextLine();
				num = Integer.parseInt(input);
				if (num < 1 || num > 999) { // 1~999 �̿��� ���� �Է��ϸ� Exception���� throw
					throw new NumberFormatException();
				}
				isValidInput = true; //�˸��� ���� �ԷµǸ� �ݺ��� Ż���ϵ���
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
