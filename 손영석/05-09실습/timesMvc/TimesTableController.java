package timesMvc;

import java.util.Scanner;

class TimesTableController {

	private Scanner userInput = new Scanner(System.in);
	private String input;

	// 메뉴 표시
	public void showMenu() {
		System.out.println("<실행할 작업>");
		System.out.println("1 : 구구단");
		System.out.println("2 : 계산기");
		System.out.println("0 : 종료");
		System.out.println("----------");
	}

	// 입력값 받아오기
	public String getInput() {
		input = userInput.next();
		userInput.nextLine();
		return input;
	}

}
