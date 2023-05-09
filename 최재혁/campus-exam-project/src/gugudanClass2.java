import java.util.Scanner;

class GugudanError extends Exception {
	GugudanError() {

	}

	GugudanError(String message) {
		super(message);
	}
}

public class GugudanClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단 숫자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); // 입력받은 숫자 i에 저장
		for (int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
			sc.close();
			while (true) {
				try {
					System.out.print("1부터 999 사이의 정수를 입력하세요 : ");
					if (i < 1 || i > 999) {
						throw new GugudanError(); // 예외 발생
					} else {
						break;
					}
				} catch (GugudanError e) {
					System.out.println("입력에러 : 1 ~ 999 사이의 정수를 입력해주세요");
					sc.nextLine(); // 입력값 받음
				}
			}
		}
	}
}
