package program2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
	public static void gugu_Ex(Scanner input, int dan) {
		while (true) {
			try {
				dan = input.nextInt();
				if(dan>999 || dan<1) {
					System.out.println("1 ~ 999������ ���� �Է¸� ��ȿ");
				}
				else {
					for (int i = 1; i < 10; i++) {
						System.out.println(dan + "x" + i + "=" + dan * i);
					}
					break;
				}
			}
			
			catch (InputMismatchException e) { //Exception e, InputMismatchException e, IOException e
				input = new Scanner(System.in);
				System.out.println("���ܹ߻�! �߸��� �Է�");
				System.out.println("1 ~ 999������ ���� �Է¸� ��ȿ");
			}

		}
	}
}
