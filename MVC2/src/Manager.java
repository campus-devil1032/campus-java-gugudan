/**
 * 서비스 제공 내역입니다.
 */
import java.util.Scanner;

public class Manager {

	public void service1() {
		Scanner sc = new Scanner(System.in);
		int dan = 0;

		while (true) {
			try {
				System.out.println("구구단 단수를 입력해주세요 : ");
				dan = sc.nextInt();
				if (dan >= 1 && dan <= 999) {
					for (int i = 1; i <= 9; i++) {
						System.out.println(dan + "X" + i + "=" + dan * i);
					}
					break;
				} else {
					System.out.println("입력오류!");
				}
			} catch (Exception e) {
				System.out.println("1~999 범위의 정수를 입력해주세요.");

			}
		}

	}

	public void service2() {
		System.out.println("아직 서비스가 존재하지 않습니다.");
	}
}
