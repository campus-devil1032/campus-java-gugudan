import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan_exp {

	public static void main(String[] args) throws IOException {
		    	Scanner scanner = new Scanner(System.in);
		    	
		    	try {
		    		System.out.println("출력할 구구단을 입력하세요(1~999단까지) : ");
		    		int dan = scanner.nextInt();
		    		
		    		if(dan<1 || dan>999) {
		    			throw new IllegalArgumentException("1에서 999단까지만 입력 가능합니다.");
		    		} //if구문에서 true라면 예외동작하여 실행종료됨.
		    		for(int i = 1; i <=9; i++) {
		    			System.out.println(dan + "x" + i + "=" + (dan*i));
		    		}
		    	} catch (InputMismatchException e) {
		    		throw new IOException("숫자를 입력해주세요.");
		    	}
		    
		    
		    }
}
