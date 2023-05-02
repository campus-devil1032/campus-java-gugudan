import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// 구구단을 출력한다.
		// 1단부터 9단까지 출력한다.
		// Optional: 유저에게 단 수를 입력받는다.
		//			  이 경우 1~999까지의 입력만 유효하게 예외처리
		// Optional: 비즈니스 로직 분리 해보세요.
		// 			 View 단과 비즈니스로직 클래스를 따로 생성해서 코드를 메인에서 분리해보세요.
		
		int mtp; // 단 수
		int i;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("출력할 구구단 단 수를 입력하세요 : ");
			mtp = sc.nextInt();
			if (mtp > 999) {
				System.out.println("1~999 사이의 값만 유효합니다.");
			}
			else {
				System.out.println("*****"+mtp+"단*****");
				for (i = 1; i <= 9; i++) {
					System.out.println(mtp+" * "+i+" = "+mtp*i);
				}
				break;
			}
		}	
	}
}
