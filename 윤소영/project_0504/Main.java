package project_0504;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		int menuNum;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			printMenu();
			System.out.print("실행할 기능 선택 > ");

			menuNum = sc.nextInt();
			
			if(menuNum == 1) {
				Calculator calc = new Calculator();
				calc.calculate();
			}else if(menuNum == 2) {
				TimesTable tt = new TimesTable();
				tt.printTimesTable();
			}else if(menuNum == 3) {
				break;
			}else { // 1, 2, 3 외의 번호 입력 시 번호 재입력 요청
				System.out.println("유효한 번호를 입력하세요.\n");
			}
		}
		sc.close();
	}
	
	public static void printMenu() {
		System.out.println("<메뉴>");
		System.out.println("1. 계산기");
		System.out.println("2. 구구단 출력");
		System.out.println("3. 종료");
		System.out.println();
	}
}

class InputOutOfBoundsException extends Exception {}