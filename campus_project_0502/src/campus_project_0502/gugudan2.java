package campus_project_0502;

import java.util.Scanner;

public class gugudan2 {
	public static void main(String[] args) {
		// 입력 받기 위해 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 단수를 입력하세요 = ");
		// 문자 입력받기
		int dan = sc.nextInt();
		
		System.out.println(dan + "단");
		
		if (dan >= 1) {
			for ( int i = 1; i < 10; i++ )
				System.out.println( dan + "X" + i + "=" + dan*i );
		} else { 
			System.out.println("입력 오류입니다.!");
		}
	}
}
