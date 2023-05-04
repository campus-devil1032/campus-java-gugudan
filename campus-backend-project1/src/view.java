import java.util.Scanner;
import java.io.IOException;


public class View {

	public static void main(String[] args) {

		boolean retry = true;// 프로그램 다시 실행을 위한 불
		while (retry) {
			Scanner scan = new Scanner(System.in);
			System.out.println("원하프로그램을 입력 하십시오 :  (구구단 1, 계산기 2)");
			String num = scan.next();
			if (num.equals("1")) {
				System.out.println("구구단 프로그램 입니다.\n");
				System.out.println("원하는 단을 입력하십시오");
				String number = scan.next();
				if (test(number)) { // 실수 정수판단
					Gugudan Gugudan = new Gugudan(number);
					Gugudan.test();
				}
			} else if (num.equals("2")) {
				System.out.println("계산기 프로그램입니다.(정수만 가능합니다.)\n");
				System.out.println("첫번째 숫자를 입력 하십시오");
				String number1 = scan.next();
				System.out.println("원하는 공식 하십시오(/,*,-,+)");
				String sign = scan.next();
				System.out.println("두번째 숫자를 입력 하십시오");
				String number2 = scan.next();
				if (test2(number1, number2)) { // 숫자 판단
					Calcultor Calcultor = new Calcultor(number1, sign, number2);
					Calcultor.calculate();
				}
			} else {
				System.out.println("제대로 된 선택을 하지 않으셨습니다.");
			}
			System.out.println("다시 시작하시겠습까? (종료를 원할시 n을 입력하십시오)");
			String check = scan.next();
			Re Re = new Re(check);
			Re.retry();
		}
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

	public static boolean test2(String s, String a) { // 숫자인지 문자인지 판단
		try {
			Integer.parseInt(s);
			Integer.parseInt(a);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("올바른 숫자가 아닙니다.");
			return false;
		}
	}
}