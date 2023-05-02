import java.util.Scanner;

public class practice_230502 {
	public static void main(String[] args) {
		// 구구단을 출력한다.
		// 1단부터 9단까지 출력한다.
		// Optional: 유저에게 단 수를 입력받는다.
		// 이 경우 1 ~ 999까지의 입력만 유효하게 예외처리를 한다.
		// Optional : 비즈니스 로직 분리 해보세요.
		// View 단과 비즈니스 로직 클래스를 따로 생성해서 코드를 분리해보세요.
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "단 출력");

			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
		System.out.println();
	}
}