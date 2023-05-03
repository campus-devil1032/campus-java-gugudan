import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 1~999 사이 값으로 입력하세요");

		while(true) {
			try {
				int i = sc.nextInt();
				if (i > 0 && i < 1000) {
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + "*" + j + "=" + i * j);
					}

				} else {
					System.out.println("숫자를 1~999 사이 값으로 다시 입력하세요");

				}

			} catch (InputMismatchException e) {
				sc = new Scanner(System.in);
				System.out.println("숫자만 입력하세요");

			}
		}
		
	}
}
