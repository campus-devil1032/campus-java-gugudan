package test1;
import java.util.Scanner;

public class myfirst {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		//스캐너 객체 생성
		//스캐너 이름 외엔 다 저렇게 객체를 생성함.(정형화 되어있다)
		//Scanner '이름' = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요 : ");
		int c = value.nextInt();
		//정수형 값을 입력받을 것이기 때문에 int를 쓴 입력메서드
		if(c >= 1 && c <= 999) {
		//유효범위 1~999를 지정해주기 위한 if문
			for(int i = 1; i < 10; i ++) {
			//구구단 for문	
				System.out.print(""+c+" x "+i+" = ");
				System.out.println(c*i);
			}
		}
		else {
			System.out.println("error : 유효하지 않은 숫자입니다.");
		}
		//예외처리??
	}

}
