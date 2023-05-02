import java.util.Scanner;

public class code2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 값을 입력해주세요");
		String a = sc.next(); // 값 입력
		int b, c; // b-저장 , c-출력

		try {
			b = Integer.valueOf(a);
			if (b < 1000) {
				System.out.println("입력하신의 단은" + a + "단 입니다");
				for (int i = 1; i < 10; i++) {
					c = b * i;
					System.out.println(a + "x" + i + "=" + c);
				}
			} else {
				System.out.println("범위오류! 1000 이하로 입력해주세요");
			}

		} catch (NumberFormatException e) {
			b = 0; // 숫자로 변환할수 없는 문자열 형태이면 0으로 초기화
			System.out.println("문자입력오류! 숫자를 입력해주세요");
		} finally {
			System.out.println("종료");
		}

		sc.close();
	}

}
