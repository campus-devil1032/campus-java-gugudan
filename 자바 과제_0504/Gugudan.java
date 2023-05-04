package MVC_Gugudan;

import java.util.Scanner;

public class Gugudan { // Model

	int dan;

	public void getGugudan() throws ConditionException {
		dan = 0;
		Scanner in = new Scanner(System.in); // 유저에게 단 수 입력받기

		System.out.println("단 수를 입력하세요");
		dan = in.nextInt();

		if (dan < 0 || dan > 999) {
			throw new ConditionException("0보다 크고 999보다 작은 숫자를 입력하세요");
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
}
