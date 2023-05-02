package example;

import java.util.Scanner;

public class Controller {

	public void name() {
		Scanner sc = new Scanner(System.in);
		int temp, num1;
		num1 = sc.nextInt();
		if ((num1 >= 1) && (num1 <= 999)) {
			for (int i = 1; i < 10; i++) {
				temp = num1 * i;
				System.out.printf("%d * %d = %d\n", num1, i, temp);
			}
		} else {
			System.out.println("1~999안의 값을 입력하세요");
		}
		
	}
	
}
