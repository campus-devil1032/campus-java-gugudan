package gugudanUpdate;

import java.util.Scanner;

class ConditionException extends Exception {
	ConditionException(String message) {
		super(message);
	}
}

class Calculator {
	int dan;
//	public Calculator(int dan) {
//		this.dan = dan;
//	}	
	// TODO 이거 받아오는 인자가 없으면 생성자를 생성 안해도 되는건가요?

	public void getCalculator() throws ConditionException {
		dan = 0;

		System.out.println("단 수를 입력하세요");
		Scanner in = new Scanner(System.in); // 유저에게 단 수 입력받기
		dan = in.nextInt();
		in.close();

		if (dan < 0 || dan > 999) {
			throw new ConditionException("예외 처리 조건입니다");
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
}

public class GugudanUpdate {
	public static void main(String[] args) {
		try {
			Calculator c = new Calculator();
			c.getCalculator();
		} catch (ConditionException e) {
			System.out.println(e.getMessage());
		}

	}
}
