package times;

import java.util.Scanner;

public class TimesTableController {

	public static int inputNum() { 	// 입력값 받기

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		return num;

	}

}
