package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
	
	//private int n;
	
	public static void GuguException(Scanner input, int dan) {
		while (true) {
			try {
				dan = input.nextInt();
				if(dan>999 || dan<1)
					System.out.println("1 ~ 999까지의 정수 입력만 유효");
				else
					break;
			}
			
			catch (InputMismatchException e) { //Exception e, InputMismatchException e, IOException e
				input = new Scanner(System.in);
				System.out.println("예외발생! 잘못된 입력");
				System.out.println("1 ~ 999까지의 정수 입력만 유효");
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
				System.out.println("예외발생! 잘못된 입력");
				//input = new Scanner(System.in);
				//CalException(input, n);
				input = new Scanner(System.in);
			}
		}
		
	}
*/
	
	
}
