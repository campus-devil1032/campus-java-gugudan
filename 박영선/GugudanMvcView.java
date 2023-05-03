import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanMvcView {
	private Scanner scanner;
	
	public GugudanMvcView() {
		scanner = new Scanner(System.in);
	}
	
	public int inputDan() throws InputMismatchException{
		System.out.println("출력할 구구단을 입력하세요(1~999단까지) : ");
		int dan = scanner.nextInt();
		return dan;
	}
	
	public void output(int[] result) {
		for(int i=1; i<=9; i++) {
			System.out.println(result[i-1]);
		}
	}
}
