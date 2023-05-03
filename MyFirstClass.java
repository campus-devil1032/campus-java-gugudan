import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstClass {

	public static void printDan() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "��");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d", i, j, i * j).println();
			}
			System.out.println();
		}
	}

	public static int inputNum() {
		try {
			System.out.println("���ϴ� ���� �Է��ϼ���. (1~999)");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			return num;
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException ���� �߻�:" + e.getMessage());
			System.out.println("�ڿ���(1~999)�� �Է��ϼ���");
		}
		return 0;
	}

	public static void main(String[] args) throws InputMismatchException {
		printDan();
		while (true) {
			int dan = inputNum();
			if (dan > 999 || dan < 1)
				System.out.println("1~999������ ���ڸ� �Է��ϼ���");
			else {
				for (int k = 1; k <= 9; k++) {
					System.out.printf("%d x %d = %d", dan, k, dan * k).println();
				}
				break;
			}
		}
	}
}
