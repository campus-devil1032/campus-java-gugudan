package gugudan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class gugudan {

	Scanner sc = new Scanner(System.in);
	
	public void div() throws NumberFormatException, InputMismatchException{
		
		System.out.println("������ ���α׷� ����.");
		
		while(true) {
			System.out.println("1~999�� ������ ���ϴ� ���ڸ� �Է����ּ���.");
			int x = sc.nextInt();
			int i;
			int result;
			if(x>=1 && x<=999) {
				for(i=0;i<10;i++) {
					result = x * i;
					System.out.println(x + " x " + i + " = " + result);
				}
//				sc.close();
			}
		}
		
	}
}
