package Homework;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) throws InputMismatchException{
		// TODO Auto-generated method stub

		System.out.println("�����ܰ� ���� ���α׷��Դϴ�.");
		System.out.println("������ ���α׷� ����� ���� 1, ���� ���α׷� ����� ���� 2�� �Է����ּ���.");
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
						System.out.println("������ ���α׷��� ���� 1, ���� ���α׷��� ���� 2�� �Է����ּ���.");
						return;
					}
				
			}
			catch(InputMismatchException e) {
				System.out.println("���ڰ� �ƴմϴ�.");
				System.out.println("������ ���α׷��� ���� 1, ���� ���α׷��� ���� 2�� �Է����ּ���.");
			}
		}
	}
}
