package program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
	
	//private int n;
	
	public static void Gugu_Ex(Scanner input, int dan) {
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
	
	
/*
	public static void CalException(Scanner input, int n) {
		while(true) {
			try {
				n = input.nextInt();
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("���ܹ߻�! �߸��� �Է�");
				//input = new Scanner(System.in);
				//CalException(input, n);
				input = new Scanner(System.in);
			}
		}
		
	}
*/
	
	
}
