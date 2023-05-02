import java.util.Scanner;

public class multi2 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (0 < i && i < 1000) {
			for (int j=1;j<=9;j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			
		}
		else {
			System.out.println("숫자를 1~999사이 값으로 입력하세요");
			int k = sc.nextInt();
			for (int j=1;j<=9;j++) {
				System.out.println(k + "*" + j + "=" + k*j);
			}
		}
	}


}
