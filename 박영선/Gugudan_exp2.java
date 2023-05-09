import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan_exp2 {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) { 
		if (num < 1 || num > 999) {
			throw new IllegalArgumentException("입력값을 잘못 입력했습니다. 1~999단까지 입력해 주세요.");
		}
		this.num = num;
	}
	
	public void print() { 
		for(int i=1; i<=9; i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Gugudan_exp2 gugudan = new Gugudan_exp2();

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


