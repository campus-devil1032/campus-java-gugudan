package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
	public static void GuguException(Scanner input, int dan) {
		while (true) {
			try {
				dan = input.nextInt();
				if(dan>999 || dan<1)
					System.out.println("1 ~ 999������ ���� �Է¸� ��ȿ");
				else
					break;
			}
			
			catch (InputMismatchException e) { //Exception e, InputMismatchException e, IOException e
				input = new Scanner(System.in);
				System.out.println("���ܹ߻�! �߸��� �Է�");
				System.out.println("1 ~ 999������ ���� �Է¸� ��ȿ");
			}

		}
	}
}
