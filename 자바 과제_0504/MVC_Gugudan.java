package MVC_Gugudan;

import java.util.Scanner;

import MVC_Gugudan.ConditionException;

public class MVC_Gugudan {// view && controller 
						//TODO view 와 컨트롤러를 어떻게 나누는거죠 도대체...
	public static void main(String[] args) throws ConditionException {

		Scanner in = new Scanner(System.in);
		String type = ""; // 사용자 입력 받기 전 초기화

		while (true) {
			System.out.println("계산기와 구구단중 어떤걸 이용할래용?");
			type = in.nextLine();

			if (type.equals("구구단") || type.equals("계산기")) {
				break;
			} else {
				throw new ConditionException("계산기와 구구단중에서만 골라주세요!");
			}

		}

		if (type.equals("계산기")) {// 연산자 입력시 연산자가 아닌 경우, 나누는 숫자가 0인경우
			try {
				Calculator ca = new Calculator();
				ca.getCalculator();
			} catch (ConditionException e) {
				System.out.println(e.getMessage());
			}
		} else if (type.equals("구구단")) {// 잡아야 할 에러 입력값이 0보다 작은경우, 999보다 큰 경우
			try {
				Gugudan gu = new Gugudan();
				gu.getGugudan();
			} catch (ConditionException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
