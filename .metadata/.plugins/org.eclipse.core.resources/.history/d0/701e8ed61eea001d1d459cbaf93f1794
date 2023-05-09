
package pack_0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGuDan_Ex3 {
	public static void main(String[] args) throws IOException {
		// 구구단 출력
		// 1단-9단까지 출력
		// Optional : 유저에게 단 수를 입력 받는다. - 이 경우 1~999까지의 입력만 유효하게 예외처리!

		while (true) {
			// 0. 화면 정리
			for (int i = 0; i < 2; i++) {
				System.out.println("");
			}
			System.out.println("========================================================");

			// 1. 게임 시작
			System.out.println("구구단을 외자, 구구단을 외자! 몇 단?");
			System.out.println("q를 입력하시면 종료됩니다.");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			// 2. 조건 체크

			if (input.equals("q")) {
				System.out.println("안녕!");
				break;
			}

			if (isInteger(input)) {
				int i = Integer.parseInt(input);
				if (i < 1000 && 0 < i) {
					// 3. 구구단 출력
					int j = 0;
					while (j < 9) {
						j++;
						System.out.println(i + "*" + j + "=" + i * j);

						if (j == 9) {
							System.out.println("구구단 재밌다!");
						}
					}
				} else {	
				}
				System.out.println("1~999의 범위에서만 입력하세요");
			}
		}
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
		}
		System.out.println("입력한 값은 문자열입니다");
		return false;
	}
}