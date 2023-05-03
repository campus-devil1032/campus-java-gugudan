package times;

import java.util.InputMismatchException;

public class TimesTableModel {

	public static void Multiplication() {

		try {

			int num = TimesTableController.inputNum();

			if (num < 1 || num > 999) { // 입력범위제한
				System.err.println("1에서 999 사이의 정수만 입력하세요.");
				return;
			}

			System.out.println(num + "단을 출력합니다.");

			for (int i = 1; i < 10; i++) {	// 계산
				System.out.println(num + " x " + i + " = " + (num * i));
			}

		} catch (InputMismatchException e) {	// 예외처리
			System.err.println("정수가 아닙니다.");
			return;
		}
	}

}
