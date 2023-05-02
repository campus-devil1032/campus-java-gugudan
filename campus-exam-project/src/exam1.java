import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		
		System.out.println("1 ~ 999사이의 숫자를 입력하시오");
		Scanner in = new Scanner(System.in);
		int i =in.nextInt();
		
		while (true) {
			
			i = in.nextInt();
			
			try {
				
				if(i > 999) {
					System.out.println("1 ~ 999사이의 숫자를 입력하시오");
				}
				else if(i < 1) {
					System.out.println("1 ~ 999사이의 숫자를 입력하시오");
				}
				else {
					break;
				}

			}

			catch (Exception e) {
				System.out.println("정수만 입력하세요");
			}

		}

		for (int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
		}
	}	
}
		
		
		
		
