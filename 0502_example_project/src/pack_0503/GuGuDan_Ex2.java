package pack_0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuGuDan_Ex2 {
	public static void main(String[] args) throws IOException {
		// 구구단 출력
		// 1단-9단까지 출력
		// Optional : 유저에게 단 수를 입력 받는다. - 이 경우 1~999까지의 입력만 유효하게 예외처리!

		System.out.println("구구단을 외자, 구구단을 외자! 몇 단?");
		System.out.println("q를 입력하시면 종료됩니다.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		if (isInteger(input)) {
			System.out.println("구구단을 외자, 구구단을 외자! 몇 단?");
			System.out.println("q를 입력하시면 종료됩니다.");
			int i = Integer.parseInt(input);
			if (i < 1000 && 0 < i) {
				int j = 0;
				while (j < 9) {
					j++;
					System.out.println(i + "*" + j + "=" + i * j);

					if (j == 9) {
						System.out.println("구구단 재밌다!");
					}
				}
			} else {
				System.out.println("1~999의 범위에서만 입력하세요");
				return;
			}
		}
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("입력한 값은 문자열입니다");
			return false;
		}

	}
}
