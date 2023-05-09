
/**
 * 서비스 제공 내역입니다.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {

	// 구구단 서비스
	public void service1() {
		Scanner sc = new Scanner(System.in);
		
		int dan = 0;

		while (true) {
			try {
				System.out.println("구구단 단수를 입력해주세요 : ");
				// 단을 입력받습니다.
				dan = sc.nextInt();
				// 1~999까지의 단만 출력 가능합니다
				if (dan < 1 || dan > 999) {
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

	
	
	// 계산기 서비스
	public void service2() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.println("서비스를 준비 중입니다.");
			System.out.println("1.더하기");
			System.out.println("2.빼기");
			System.out.println("3.곱하기");
			System.out.println("4.나누기");
			System.out.println("0.종료");

			num = sc.nextInt();
			if (num == 0) {
				System.out.println("계산기를 종료합니다.");
				break;
			} else if (num > 4) {
				System.out.println("메뉴를 잘못 선택하였습니다.");
				continue;
			}
		}
	}
}
