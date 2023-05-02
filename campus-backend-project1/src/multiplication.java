import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		
		view();
		// 구구단을 출력 한다.
		// 1단부터 9단까지 출력한다.

		
}
static void view() {
	
	boolean retry = true;//프로그램 다시 실행을 위한 불
		while (retry) {
			int i;
			Scanner number = new Scanner(System.in);
			System.out.println("원하는 구구단의 단을 입력하십시오. ");
			i = number.nextInt();
			if (0 < i && i < 999)//0부터 999안의 숫자만 입력
			{
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + j * i); //구구단 출력
				}

			} else {
				System.out.println("입력하신 숫자가 너무 크거나 음수입니다.");
			}
			
			System.out.println("다시 시작하시겠습까? (y/n)");
			String check = number.next();
			if (check.equals("n"))//입력 문자가 n이면 retry갑변경
			{
				retry = false;
			}
		}
		System.out.println("구구단 프로그램 종료");
		System.exit(0);
	}
}