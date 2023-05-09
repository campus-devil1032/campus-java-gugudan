package capsule_cal;

import java.util.InputMismatchException;
import java.util.Scanner;

class CapController {
	void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 1~999 사이 값으로 입력하세요");

		while (true) {
			try {
				int dan = sc.nextInt();
				if (dan > 0 && dan < 1000) {

					Cap gugudan = new Cap();
					gugudan.setDan(dan);
					gugudan.print();
				}

				else {
					System.out.println("숫자를 1~999 사이 값으로 다시 입력하세요");

				}

			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("숫자만 입력하세요");

			}
		}
	}
}