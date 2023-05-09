package two_week_project;

import java.io.IOException;
import java.util.Scanner;

public class CalcuExamRunner {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); // 첫번쨰수입력
		int num2 = sc.nextInt(); // 두번째수입력
		char operation = sc.next().charAt(0); // 연산자 입력

		CalcuExam cal = new CalcuExam(num1, num2, operation); // 객체생성
		
		//산수연산자 예외캐치 
		try {
			cal.validatOperator();
		} catch (UserExcpetion e) {
			e.printStackTrace();
		}
		cal.show();

	}
}
