package gugudan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class gugudan {

	Scanner sc = new Scanner(System.in);
	
	public void div() throws NumberFormatException, InputMismatchException{
		
		System.out.println("구구단 프로그램 시작.");
		
		while(true) {
			System.out.println("1~999의 숫자중 원하는 숫자를 입력해주세요.");
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
