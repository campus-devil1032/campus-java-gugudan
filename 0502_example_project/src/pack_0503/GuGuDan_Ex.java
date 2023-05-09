package pack_0503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * (1) Integer.parseInt 함수를 두 번 호출하고 있음
 * (2) 이걸 왜 여기서?
 * (3) 의도하지 않은 에러도 같이 처리됨
 * (4) 함수 만든 의도가?
 */
public class GuGuDan_Ex {
	public static void main(String[] args) throws IOException {
		// 구구단 출력
		// 1단-9단까지 출력
		// Optional : 유저에게 단 수를 입력 받는다. - 이 경우 1~999까지의 입력만 유효하게 예외처리!
		System.out.println("구구단을 외자, 구구단을 외자! 몇 단?");
		System.out.println("q를 입력하시면 종료됩니다.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int change = Integer.parseInt(input);
		if (change < 1000 && 0 < change) {
			int i = 0;
			while (i < 9) {
				i++;
				System.out.println(change + "*" + i + "=" + change * i);
			}
			System.out.println("구구단 재밌다!");
			return;

		} else if (change <= 0 || 1000 <= change) {
			System.out.println("1~999의 범위에서만 입력하세요");
			return;
			
		} else {
			System.out.println("입력한 값은 문자열입니다");
			return;
		}
	}

}
