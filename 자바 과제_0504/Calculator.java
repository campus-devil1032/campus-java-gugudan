package MVC_Gugudan;
import java.util.Scanner;

public class Calculator { //Model
		int input1 = 0;
		int input2 = 0;
		char operator =' ' ;
		
		public void getCalculator() throws ConditionException {
			Scanner in = new Scanner(System.in);
			
			
			System.out.println("첫 번째 숫자를 입력하세요");
			input1 = in.nextInt();
			System.out.println("연산자를 입력하세요(+, -, *, /");
			operator = in.next().charAt(0);
			System.out.println("두번째 숫자를 입력하세요");
			input2 = in.nextInt();
			in.close();
			
			if (operator == '+') {
				System.out.println(input1 + input2);  
			} else if (operator == '-') {
				System.out.println(input1 - input2);
			} else if (operator == '*') {
				 System.out.println(input1 * input2);
			} else if (operator == '/') {
				if(input2 == 0) {
					throw new  ConditionException("0이아닌 숫자를 입력하세요");
				}else {
				System.out.println(input1 / input2);
				}
			} else 
				throw new ConditionException("연산자가 아닌 것을 입력하셨습니다");
			
		}
	}


