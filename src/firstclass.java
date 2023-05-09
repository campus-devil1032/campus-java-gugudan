import java.util.Scanner;

public class firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단을 출력한다.
		// 1단부터 9단까지 출력한다.
		//optional: 유저에게  단 수를 입력받는다.
		//          이경우 1~999까지의 입력만 유효하게 예외처리
		//optional : 비즈니스 로직 분리 해보세요
		//          View 단과 비즈니스 로직 클래스를 따로 생성해서 코드를 메인에서 분리 시켜보세요
		System.out.println("출력할 구구단의 단수를 입력 하세요");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();// 정수 c 에대한 입력값을 받음
		while(c<=0||c>999) {
			System.out.println("잘못된 숫자를 입력 하셨습니다 다시입력해주세요");
			c = sc.nextInt();
		}	// 1~999 이외에는 답을 반려함
		//결과 부분//
		System.out.println(c + "단을 출력 하겠습니다");
		System.out.println(c+" x 1 = "+c*1);
		System.out.println(c+" x 2 = "+c*2);
		System.out.println(c+" x 3 = "+c*3);
		System.out.println(c+" x 4 = "+c*4);
		System.out.println(c+" x 5 = "+c*5);
		System.out.println(c+" x 6 = "+c*6);
		System.out.println(c+" x 7 = "+c*7);
		System.out.println(c+" x 8 = "+c*8);
		System.out.println(c+" x 9 = "+c*9);
		}
	}
