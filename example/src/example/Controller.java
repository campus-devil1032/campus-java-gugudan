package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

	public void gugudan() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i;
		try {
			i = Integer.parseInt(bf.readLine());
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		} 
		catch (IOException e) {
			System.out.println("정수를 입력하시오...");
		} 
		catch (NumberFormatException e) {
			System.out.println("정수를 입력하시오...");
		} 
		catch (Error e) {
			System.out.println("여기서 오류를 캐치하네요?");
		}
	}

}

