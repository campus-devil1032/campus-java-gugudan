import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code2 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("원하시는 값을 입력해주세요");

		String a = null; // 기존 scanner과 달리 buffer는 초기화 미진행시 에러 발생..
		try {
			a = br.readLine();
		} catch (IOException e1) {

			e1.printStackTrace();
			// logger.error("Error test!!", e1);
			// ToDo : stacktrace보단 가급적 logger를 사용할것 (여기선 프레임워크 추가가 필요..)
		}

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
			System.out.println("문자입력오류! 정수를 입력해주세요");
		}
		System.out.println("종료");
	}

}
