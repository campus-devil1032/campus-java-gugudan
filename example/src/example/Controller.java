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
			System.out.println("������ �Է��Ͻÿ�...");
		} 
		catch (NumberFormatException e) {
			System.out.println("������ �Է��Ͻÿ�...");
		} 
		catch (Error e) {
			System.out.println("���⼭ ������ ĳġ�ϳ׿�?");
		}
	}

}

