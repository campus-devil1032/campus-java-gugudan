package pack_0502;

import java.util.Scanner;

public class GuGuDan {
	public static void main(String[] args) {
		// 구구단 출력
		// 1단-9단까지 출력
		// Optional : 유저에게 단 수를 입력 받는다. - 이 경우 1~999까지의 입력만 유효하게 예외처리!
		// Optional : 비즈니스 로직 분리 - View 단과 비즈니스 로직 클래스를 따로 생성해서 코드를 메인에서 분리

		while (true) {
			System.out.println("구구단을 외자, 구구단을 외자! 몇 단?");
			System.out.println("0을 입력하시면 종료됩니다.");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			if (i == 0) {
				System.out.println("안녕~");
				break;
			}
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
			}
		}
	}
}
