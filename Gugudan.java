package gugudan;

import java.util.Scanner;

public class Gugudan {

	public static boolean MyException(int dan) {// 기존 코드에서 예외조건 메인에서 분
		if (dan <= 0 || dan > 999) {
			return false;
		} else
			return true;
	}

	public static void Calculator(int dan) {// 구구단 기능 메인에서 분

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
	}

	public static void main(String[] args) {
		int dan = 0;
		System.out.println("단 수를 입력하세요");
		Scanner in = new Scanner(System.in);
		dan = in.nextInt();
		in.close();

		if (MyException(dan) == false) {
			System.out.println("예외 조건입니다");
		} else {
			Calculator(dan);
		}
	}
}