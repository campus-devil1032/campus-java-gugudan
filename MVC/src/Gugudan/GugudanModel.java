package Gugudan;

import java.util.Scanner;

public class GugudanModel {

	int input_first, input_last;

	int inputValue(int dan) throws Exception {
		// 입력
		Scanner in = new Scanner(System.in);
		System.out.print("구구단의 시작단을 입력하세요 ");
		this.input_first = in.nextInt();
		System.out.print("구구단의 마지막단을 입력하세요  ");
		this.input_last = in.nextInt();

		// 예외 발생시키기, 범위가 2~9 미만 및 초과시 아래 메세지 표시 후 12번줄 호출(다시 입력)
		if ((input_first < 2 || input_first > 9) || (input_last < 2 || input_last > 9)) {
			throw new Exception("구구단은 2~9단을 입력하세요.");
		}
		// 예외없으면 아래로 이동
		dan = 1;
		return dan;

	}

	// 반복문 사용하여 결과값 메인과 연동 -> view랑 연동되야함
	void outputResult() {
		// 첫번째 입력값이 클 경우 , 단을 줄여나가는 형식 j--
		if (input_first > input_last) {
			for (int i = 1; i <= 9; i++) {
				for (int j = input_first; j >= input_last; j--) {
					String result = Integer.toString(j * i);

					if (result.length() == 1) {
						System.out.print(j + " * " + i + " =  " + result + "   ");

					} else
						System.out.print(j + " * " + i + " = " + result + "   ");
				}
				System.out.println();

			}

			// 두번째 입력값이 큰 경우, 단을 늘려가는 형식 j++
		} else if (input_last > input_first) {
			for (int i = 1; i <= 9; i++) {
				for (int j = input_first; j <= input_last; j++) {
					String result = Integer.toString(j * i);

					if (result.length() == 1) {
						System.out.print(j + " * " + i + " =  " + result + "   ");
					} else
						System.out.print(j + " * " + i + " = " + result + "   ");
				}
				System.out.println();
			}

			// 두 입력값이 동일한 경우, 한 번만 출력
		} else if (input_first == input_last) {
			for (int i = 1; i <= 9; i++) {
				String result = Integer.toString(input_first * i);
				if (result.length() == 1) {
					System.out.println(input_first + " * " + i + " =  " + result);
				} else
					System.out.println(input_first + " * " + i + " = " + result);
			}
		}
	}
}