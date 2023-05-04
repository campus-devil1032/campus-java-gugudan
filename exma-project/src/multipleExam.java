import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExam { // 구구단 출력 예제
	public static void main(String[] args) {
		while (true) {
			int input = 0;
			System.out.println("1 : 구구단, 2 : 계산기, 3: 종료");
			System.out.print("숫자를 입력하세요 : ");
			Scanner sc = new Scanner(System.in); // 사용자가 입력할 숫자를 받는 변수 선언시 1라인의 import문 필요
			input = sc.nextInt();
			if (input == 1) {
				System.out.print("1~999사이의 숫자를 입력해주세요 : ");
				int num1 = 0; // num1 변수 초기화

				// try-catch문으로 예외처리하기 : 숫자가 아닌 문자를 입력받을 경우 프로그램 종료
				try {
					num1 = sc.nextInt(); // 입력받은 변수를 int형 변수에 저장한다.
					if ((num1 > 999) || (num1 < 1)) // 1~999 범위를 넘어가는 숫자 발생 시 예외 처리
						System.out.println("숫자의 범위가 맞지 않습니다. 1~999사이의 숫자를 입력해주세요");
					else {
						for (int i = 1; i <= 9; i++) { // 숫자의 범위가 일치할 경우 구구단 출력
							System.out.println(num1 + " * " + i + " = " + num1 * i);
						}
					}
				} catch (InputMismatchException e) {
					// 입력받은 변수의 타입과 선언한 변수의 타입이 맞지 않을 경우 발생하는 exception
					System.out.println("숫자가 아닙니다. 프로그램을 종료합니다.");
				}
			} else if (input == 2) { // 계산기
				System.out.println("숫자 2개를 입력해주세요 : ");
				int cNum1 = sc.nextInt();
				int cNum2 = sc.nextInt();
				int res = 0;

				System.out.println("구하고자 하는 연산을 입력해주세요 : ");
				char cal;
				cal = sc.next().charAt(0); // scanner를 통해 입력받은 라인중 첫번째 단어를 추출해 cal변수에 저장

				if (cal == '+') {
					res = cNum1 + cNum2;
					System.out.println(cNum1 + " + " + cNum2 + " = " + res);
				} else if (cal == '-') {
					if (cNum1 < cNum2) {
						System.out.println("첫 번째 수가 두 번째 수보다 작습니다. 첫 번째 숫자를 두 번째 숫자보다 크게 입력해주세요");
					} else {
						res = cNum1 - cNum2;
						System.out.println(cNum1 + " - " + cNum2 + " = " + res);
					}
				} else if (cal == '*') {
					res = cNum1 * cNum2;
					System.out.println(cNum1 + " * " + cNum2 + " = " + res);
				} else if (cal == '/') {
					if (cNum1 == '0') {
						System.out.println("나눠지는 숫자는 0이 될 수 없습니다. 다시 입력하시기 바랍니다.");
					} else {
						res = cNum1 / cNum2;
						System.out.println(cNum1 + " / " + cNum2 + " = " + res);
					}
				}

			} else if (input == 3) {
				System.out.println("프로그램을 종료합니다.");
				sc.close(); // OS에게 자원을 되돌려줌
				break;
			} else {
				System.out.println("잘못된 숫자를 입력하였습니다. 다시 입력하시기 바랍니다.");
			}
		} // while문 종료
	}
}
