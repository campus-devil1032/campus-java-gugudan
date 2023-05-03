package gugudan;

import java.io.IOException;
import java.util.Arrays;

public class Controller {
	public static void main(String[] args) throws IOException {
		//선언부
		int num1;
		int[] num2 = new int[10];
		Model model = new Model();
		View view = new View();
		//입력 출력
		System.out.println("숫자를 입력하세요!!");
		num1 = model.enterValue();
		num2 = model.calculation(num1);
		view.prettyView(num2, num1);	
	}
	
}
