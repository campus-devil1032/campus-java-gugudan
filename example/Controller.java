package gugudan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		// 입력 출력

		while (true) {
			int dan;
			int[] gugudanArray = new int[10];
			System.out.println("1:계산기	2:구구단	3:종료");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int selectOperation, operation;
			double firstParameter, secParameter;

			try {
				selectOperation = Integer.parseInt(bf.readLine()); // 1 계산기, 2 구구단, 3 종료
				if (selectOperation == 1) {
					System.out.println("숫자를 입력하세요!!");
					firstParameter = model.enterDoubleValue();
					System.out.println("1:+ 	2:- 	3:* 	4:/ 	5:%");
					operation = model.enterIntValue();
					System.out.println("숫자를 입력하세요!!");
					secParameter = model.enterDoubleValue();
					System.out.println("결과값: " + model.calculator(operation, firstParameter, secParameter));
				} else if (selectOperation == 2) {
					System.out.println("숫자를 입력하세요!!");
					dan = model.enterIntValue();
					gugudanArray = model.calculation(dan);
					view.gugudanView(gugudanArray, dan);
				} else if (selectOperation == 3) {
					System.out.println("종료....");
					break;
				} else {
					throw new UserException();
				}

			} catch (NumberFormatException e) {
				System.out.println("입력오류..");
			} catch (IOException e) {
				System.out.println("입력오류..");
			} catch (RuntimeException e) {
				System.out.println("다시 작성해주세요");
			}

		}
	}

}
