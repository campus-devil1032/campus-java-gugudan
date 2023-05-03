import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;

public class gugudan {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("출력할 구구단의 단수를 입력 하세요");
		String input = br.readLine();
		if (isInteger(input)) {
			int num = Integer.parseInt(input);
			viewgugudan (num);
		}

}
	private static void viewgugudan(int num) {
		System.out.println(num+"단을 출력합니다");
		for(int i = 1; i<=9; i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}
		
	}
	public static boolean isInteger(String num) {
		try {
			int n = Integer.parseInt(num);
			if (n>999||n<1) 
				throw new DanvalueException();
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요");
			return false;
		} catch (DanvalueException e) {
			return false;
		}
		return true;
	}
}
