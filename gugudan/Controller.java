package gugudan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
	public static void main(String[] args) {
		// 선언부
		int num1;
		int[] num2 = new int[10];
		Model model = new Model();
		View view = new View();
		// 입력 출력

		while (true) {
			System.out.println("1:계산기	2:구구단	3:종료");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int num3, operation;
			double num4, num5;

			try {
				num3 = Integer.parseInt(bf.readLine()); // 1 계산기, 2 구구단 3, 종료
				if (num3 == 1) {
					System.out.println("숫자를 입력하세요!!");
					num4 = model.enterDoubleValue();
					System.out.println("1:+ 	2:- 	3:* 	4:/ 	5:%");
					operation = model.enterIntValue();
					System.out.println("숫자를 입력하세요!!");
					num5 = model.enterDoubleValue();
					System.out.println("결과값: " + model.calculator(operation, num4, num5));
				} else if (num3 == 2) {
					System.out.println("숫자를 입력하세요!!");
					num1 = model.enterIntValue();
					num2 = model.calculation(num1);
					view.gugudanView(num2, num1);
				} else if (num3 == 3) {
					System.out.println("종료....");
					break;
				} else {
					throw new UserException();
				}

			}catch (NumberFormatException e) {
				System.out.println("입력오류..");
			}
			catch (IOException e) {
				System.out.println("입력오류..");
			}catch (RuntimeException e) {
				System.out.println("다시 작성해주세요");
			}

		}
	}

}
