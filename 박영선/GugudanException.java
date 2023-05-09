import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanException {

	private int num; //사용자로부터 입력받을 단수

	public void print() { 
		for(int i=1; i<=9; i++) { //  i가 1~9값이 참
			System.out.println(num+"x"+i+"="+(num*i)); // 사용자가 입력한 단수를 적용한 구구단 식
		}
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) { 
		if (num < 1 || num > 999) { // num이 1미만이거나, 999초과이면 참 
			throw new IllegalArgumentException("입력값을 잘못 입력했습니다. 1~999단까지 입력해 주세요."); // 잘못입력하면 예외메세지 전달
		}
		this.num = num;
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GugudanException gugudan = new GugudanException();

		while (true) {
			try {
				System.out.print("구구단을 입력하세요 : ");
				int num = Integer.parseInt(scanner.nextLine());
				gugudan.setNum(num);
				break;
			} catch (NumberFormatException e) {
				System.out.println("구구단은 1~999단까지만 입력해주세요."); // 이 문구는 언제 나오는 걸까?
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		gugudan.print();
		
	}
}


