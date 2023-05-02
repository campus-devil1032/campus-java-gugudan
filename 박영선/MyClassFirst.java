import java.util.Scanner;

public class MyClassFirst {

	public static void main(String[] args) {
		System.out.println("구구단을 실행할 숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i >= 1 && i <= 999) {
		for (int j = 1; j < 10; j++) {
			System.out.println(i + "x" + j+"="+i*j);
		}  System.out.println("입력값은 1~999까지입니다.");
		
	}
  }
}