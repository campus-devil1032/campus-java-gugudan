package program2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
	public static void gugu_Ex(Scanner input, int dan) {
		while (true) {
			try {
				dan = input.nextInt();
				if(dan>999 || dan<1) {
					System.out.println("1 ~ 999까지의 정수 입력만 유효");
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
				System.out.println("예외발생! 잘못된 입력");
				System.out.println("1 ~ 999까지의 정수 입력만 유효");
			}

		}
	}
}
