package campus_java;

import java.util.*;

public class MyFirstClass {

	public static void gugudan(int n) {
		System.out.println(n + " 단 ");
		for(int i = 1; i<=9; i++) {
			System.out.println(n + "*" + i + "=" + (n*i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//구구단을 출력한다.
		//1단부터 9단까지 출력한다.
		// Optinal :유저에게 단 수를 입력받는다.
		//			이 경우 1~999까지의 입력만 유효하게 예외처리를 한다.
		// Optional : 비즈니스 로직 분리 해보세요. View 단과 비즈니스 로직 클래스를 따로 생성해서 코드를 메인에서 분리해보세요.
		
		// 2단부터 시작하고 9단까지 실행하며 반복문이 한번 돌때마다 1씩 증가 시킵니다.
		
		
		/*for(int i=2; i < 10; i++) {
			System.out.println(i + "단을 출력 합니다.");
            
 			for(int j=1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}*/
		
		
		/*System.out.println("구구단을 실행할 숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		if(dan >=1 && dan <=999) {

			for (int i = 1; i<10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				
			}
		}
		
		*/
		
		for(int i =2; i<=9; i++) {
			gugudan(i);
		}
		
	}

}