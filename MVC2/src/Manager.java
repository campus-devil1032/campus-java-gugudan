
/**
 * 서비스 제공 내역입니다.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {

	// 구구단 서비스
	public void service1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 단수를 입력해주세요 : ");
		int dan = 0;

		while (true) {
			try {
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
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		// 1~9까지 곱하는 구구단을 출력합니다
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "X" + i + "=" + dan * i);
		}
	}

	public void service2() {
		System.out.println("아직 서비스가 존재하지 않습니다.");
	}
}
