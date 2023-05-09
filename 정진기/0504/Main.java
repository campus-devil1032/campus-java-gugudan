package Homework;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) throws InputMismatchException{
		// TODO Auto-generated method stub

		System.out.println("구구단과 계산기 프로그램입니다.");
		System.out.println("구구단 프로그램 사용은 숫자 1, 계산기 프로그램 사용은 숫자 2를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		
		Gugudan Gugudan = new Gugudan();
		Calculator Calculator = new Calculator();
		while(true) {
			try {
				int choice = sc.nextInt();
					if(choice==1) {
						try {
							Gugudan.Gugu();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						sc.close();
					}
					else if(choice==2) {
						Calculator.Cal();
						sc.close();
						return;
					}
					else {
						System.out.println("구구단 프로그램은 숫자 1, 계산기 프로그램은 숫자 2를 입력해주세요.");
						return;
					}
				
			}
			catch(InputMismatchException e) {
				System.out.println("숫자가 아닙니다.");
				System.out.println("구구단 프로그램은 숫자 1, 계산기 프로그램은 숫자 2를 입력해주세요.");
			}
		}
	}
}
