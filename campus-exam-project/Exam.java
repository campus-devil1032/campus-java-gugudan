import java.util.Scanner;
//구구단을 출력한다.
//1단부터 9단까지 출력한다.
//Optional: 유저에게 단 수를 입력받는다.
//			이 경우 1~999까지의 입력만 유효하게 예외처리를 한다.
//Optional: 비즈니스 로직 분리 해보세요.
//			view 단과 비지니스 로직 클래스를 따로 생성해서 코드를 메인에서 분리해보세
public class Exam {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
		      for (int j = 1; j <= 9; j++) {
		        System.out.print(i+"*"+j+"="+String.format("%2d", i * j));
		        System.out.print(" ");
		      }
		      System.out.println();

		}
	}
}
