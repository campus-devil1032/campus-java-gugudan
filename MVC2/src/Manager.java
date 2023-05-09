
/**
 * 서비스 제공 내역입니다.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {

	/**
	 * 구구단 서비스 
	 * 1. 유저에게 단을 입력받는다 
	 * 2. 단은 1~999의 정수만 입력할 수 있다. 
	 * 3. 이 외의 범위를 입력할 경우 예외처리 throw new 
	 * 4. 1~9까지 곱하는 구구단을 출력한다.
	 */
	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		int dan = 0;

		while (true) {
			try {
				System.out.println("=======구구단=======");
				System.out.println("구구단 단수를 입력해주세요 : ");
				
				// 단을 입력받습니다.
				dan = sc.nextInt();

				if (dan < 1 || dan > 999) { // 1~999까지의 단만 출력 가능합니다
					// 잘못된 인수 입력 오류
					throw new IllegalArgumentException("1~999 사이의 정수를 입력해주세요.");
				} 
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("입력오류! 1~999 범위의 정수만을 입력해주세요.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		// 1~9까지 곱하는 구구단을 출력합니다
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "X" + i + "=" + dan * i);
		}
	}

	/**
	 * 계산기 서비스 
	 * 1. 계산기 메뉴 구성 
	 * 2. 유저에게 메뉴 번호를 입력받는다 
	 * 3. 각 번호에 따른 기능을 구현한다
	 */
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			// 계산기 메뉴 구성
			System.out.println("=======계산기=======");
			System.out.println("=======Menu=======");
			System.out.println("1.더하기");
			System.out.println("2.빼기");
			System.out.println("3.곱하기");
			System.out.println("4.나누기");
			System.out.println("0.종료");

			num = sc.nextInt();
			if (num == 0) {
				System.out.println("계산기를 종료합니다.");
				break;
			} else if (num > 4) { // 없는 번호를 입력했을 때
				System.out.println("메뉴를 잘못 선택하였습니다.");
				continue;
			}

			// 숫자 2개에 대한 계산 기능
			System.out.println("첫 번쨰 숫자를 입력하고, 엔터를 누르세요");
			int num1 = sc.nextInt();
			System.out.println("두 번쨰 숫자를 입력하고, 엔터를 누르세요");
			int num2 = sc.nextInt();

			if (num == 1) { // 더하기
				int result1 = num1 + num2;
				System.out.println("더하기 결과 : " + result1);
				break;
			}
			if (num == 2) { // 뺴기
				int result2 = num1 - num2;
				System.out.println("빼기 결과 : " + result2);
				break;
			}
			if (num == 3) { // 곱하기
				int result3 = num1 * num2;
				System.out.println("곱하기 결과 : " + result3);
				break;
			}
			if (num == 4) { // 나누기
				int result4 = num1 / num2;
				System.out.println("나누기의 몫 : " + result4);
				int result5 = num1 % num2;
				System.out.println("나누기의 나머지 : " + result5);
				break;
			}
		}
	}
}
