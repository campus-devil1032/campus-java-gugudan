package project_0504;

import java.util.Scanner;

public class TimesTable {
	private Scanner sc = new Scanner(System.in);
	private int num;
	
	public TimesTable() {}
	
	public void printTimesTable() {
		while (true) {
			System.out.print("\n출력할 단 수를 입력하세요.\n(0 입력 시 구구단 출력 종료)\n> ");
			this.num = sc.nextInt();
			if(num == 0) {
				System.out.println();
				break;
			}
			try {
				printTt(num);
				System.out.println(num + "단을 출력합니다.");
				for(int i=1; i<10; i++) {
					System.out.println(num + " * " + i + " = " + num*i);
				}
			}catch(InputOutOfBoundsException e) { // 사용자 입력값이 1~999 범위를 벗어났을 때 발생
				System.out.println("1과 999 사이의 수를 입력하세요.");
			}
		}
	}
	
	public static void printTt(int num) throws InputOutOfBoundsException { 
		if (num > 999) {
			throw new InputOutOfBoundsException();
		}
	}
}