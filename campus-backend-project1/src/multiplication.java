import java.util.Scanner;
import java.io.IOException;

class Gugudan { // 구구단 계산 class
	String number;

	Gugudan(String number) {
		this.number = number;
	}

	public void Gugudan() {
		int i = Integer.parseInt(number);
		if (0 < i && i < 1000)// 0부터 999안의 숫자만 입력
		{
			for (int j = 1; j < 10; j++) {
				System.out.println("	"+number + "*" + j + "=" + j * i); // 구구단 출력
			}
		} else {
			System.out.println("입력하신 숫자가 너무 크거나 음수입니다.");
		}
	}
}

public class multiplication {

	public static void main(String[] args) {
		view();
		// 구구단을 출력 한다.
		// 1단부터 9단까지 출력한다.
	}

	static void view() {
		boolean retry = true;// 프로그램 다시 실행을 위한 불
		while (retry) {
			Scanner scan = new Scanner(System.in);
			System.out.println("원하는 구구단의 단을 입력하십시오. ");
			String num = scan.next();
			if (test(num)) { // 실수 정수판단
				Gugudan Gugudan = new Gugudan(num);
				Gugudan.Gugudan();
			}
			System.out.println("다시 시작하시겠습까? (종료를 원할시 n을 입력하십시오)");
			String check = scan.next();
			if (check.equals("n"))// 입력 문자가 n이면 retry 값 변경
			{
				retry = false;
			}
		}
		System.out.println("구구단 프로그램 종료");
		System.exit(0);// 프로그램 종료
	}

	public static boolean test(String s) { // 실수 정수 판단
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("올바른 정수가 아닙니다.");
			return false;
		}
	}
}