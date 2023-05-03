import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstClass {

	public static void printDan() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d", i, j, i * j).println();
			}
			System.out.println();
		}
	}

	public static int inputNum() {
		try {
			System.out.println("원하는 단을 입력하세요. (1~999)");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			return num;
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException 예외 발생:" + e.getMessage());
			System.out.println("자연수(1~999)만 입력하세요");
		}
		return 0;
	}

	public static void main(String[] args) throws InputMismatchException {
		printDan();
		while (true) {
			int dan = inputNum();
			if (dan > 999 || dan < 1)
				System.out.println("1~999사이의 숫자를 입력하세요");
			else {
				for (int k = 1; k <= 9; k++) {
					System.out.printf("%d x %d = %d", dan, k, dan * k).println();
				}
				break;
			}
		}
	}
}
