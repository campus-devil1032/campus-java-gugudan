package NewGugudan;

import java.util.Scanner;

class NewGugudanView {
	private Scanner scanner;

	public NewGugudanView() {
		scanner = new Scanner(System.in);
	}

	public int getDanInput() {
		System.out.print("���� �Է��ϼ��� (1~9 ����): ");
		return Integer.parseInt(scanner.nextLine());
	}

	public void displayMultiplicationTable(int dan) {
		System.out.printf("������ %d��:%n", dan);
	}

	public boolean getContinueInput() {
		while (true) {
			System.out.print("��� �Ͻðڽ��ϱ�? (y/n): ");
			String input = scanner.next();
			if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
				closeScanner();
				return false;
			} else if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
				return true;
			} else {
				System.out.println("��ȿ�� �Է°��� �ƴմϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	public void closeScanner() {
		scanner.close();
	}
}
