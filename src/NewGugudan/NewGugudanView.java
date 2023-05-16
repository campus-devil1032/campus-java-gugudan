package NewGugudan;

import java.util.Scanner;

class NewGugudanView {
	private Scanner scanner;

	public NewGugudanView() {
		scanner = new Scanner(System.in);
	}

	public int getDanInput() {
		System.out.print("단을 입력하세요 (1~9 사이): ");
		return Integer.parseInt(scanner.nextLine());
	}

	public void displayMultiplicationTable(int dan) {
		System.out.printf("구구단 %d단:%n", dan);
	}

	public boolean getContinueInput() {
		while (true) {
			System.out.print("계속 하시겠습니까? (y/n): ");
			String input = scanner.next();
			if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
				closeScanner();
				return false;
			} else if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
				return true;
			} else {
				System.out.println("유효한 입력값이 아닙니다. 다시 입력해주세요.");
			}
		}
	}

	public void closeScanner() {
		scanner.close();
	}
}
