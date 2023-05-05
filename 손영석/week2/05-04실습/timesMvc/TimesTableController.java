package timesMvc;

import java.util.Scanner;

public class TimesTableController {

	Scanner sc = new Scanner(System.in);

	// 메뉴 표시
	public void showMenu() {
		System.out.println("<실행할 작업>");
		System.out.println("1 : 구구단");
		System.out.println("2 : 계산기");
		System.out.println("0 : 종료");
	}

	// 메뉴 선택
	public int getSelect() {
		int select = sc.nextInt();
		sc.nextLine();
		return select;
	}

	// int값 받아오기
	public int getNum() {
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	// double값 받아오기
	public double getDoubleNum() {
		double num = sc.nextDouble();
		sc.nextLine();
		return num;
	}

	// 연산자 받아오기
	public String getOperator() {
		String operator = sc.next();
		sc.nextLine();
		return operator;
	}

}
