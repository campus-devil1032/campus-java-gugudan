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
		
		// 구구단 단 수 입력
		while(!isValidInput) {
			System.out.println("출력할 구구단의 단 수를 입력하세요: ");
			try {
				String input = scanner.nextLine();
				num = Integer.parseInt(input);
				if (num < 1 || num > 999) { // 1~999 이외의 값을 입력하면 Exception으로 throw
					throw new NumberFormatException();
				}
				isValidInput = true; //알맞은 값이 입력되면 반복문 탈출하도록
			} catch (NumberFormatException e) {
				System.out.println("1~999 사이의 값만 유효합니다.");
			}
		}
		controller.showTable(num);
	}
	
	public void displayTable(String table) {
		System.out.println(table);
	}

}
