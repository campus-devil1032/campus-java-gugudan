package timesMvc;

import java.util.Scanner;

class TimesTableController {

	Scanner sc = new Scanner(System.in);

	// 메뉴 표시
	void showMenu() {
		System.out.println("<실행할 작업>");
		System.out.println("1 : 구구단");
		System.out.println("2 : 계산기");
		System.out.println("0 : 종료");
		System.out.println("----------");
	}

	// 입력값 받아오기
	String getInput() {
		String input = sc.next();
		sc.nextLine();
		return input;
	}

}
