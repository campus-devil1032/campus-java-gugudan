package a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class gugudan2 {

	public static void main(String[] args) {

		System.out.println("�� �Է� : ");

		try {

			while (true) {
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();

				if (num < 1000) {
					for (int i = 1; i <= 9; i++) {
						System.out.println(num + "x" + i + "=" + (num * i) + "");
					}
				} else {
					System.out.println("1���� 999���� ���ڸ� �Է��ϼ���.");
					continue;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}
	}
}


