import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		
		System.out.println("1 ~ 999사이의 숫자를 입력하시오");
		Scanner in = new Scanner(System.in);
		int i =in.nextInt(); // 입력값을 변수에 넣음 
		
		while (true) {
				
			if(i > 999 || i < 1) { // 1 ~999 
				System.out.println("1 ~ 999사이의 숫자를 입력하시오");
				i = in.nextInt();
			}
			else {
				// System.out.println("정수를 입력하시오"); 
				break;
			}
			

		}

		for (int j = 1; j < 10; j++) {
			System.out.println(i + "X" + j + "=" + i * j);
		}
	}	
}
		
		
		
		
