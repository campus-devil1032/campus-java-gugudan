import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExam {	// 구구단 출력 예제
	public static void main(String[] args) {
		System.out.print("1~999사이의 숫자를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);	// 사용자가 입력할 숫자를 받는 변수 선언시 1라인의 import문 필요
        int num1 =0;	// num1 변수 초기화
        
        //try-catch문으로 예외처리하기 : 숫자가 아닌 문자를 입력받을 경우 프로그램 종료
        try {
        	num1 = sc.nextInt();    // 입력받은 변수를 int형 변수에 저장한다.
        	if((num1 > 999) || (num1 < 1))	// 1~999 범위를 넘어가는 숫자 발생 시 예외 처리
                System.out.println("숫자의 범위가 맞지 않습니다. 1~999사이의 숫자를 입력해주세요");
            else{
                for(int i=1; i<=9; i++){	// 숫자의 범위가 일치할 경우 구구단 출력
                    System.out.println(num1 + " * " + i + " = " + num1*i);
                }
            }
        	sc.close();	// OS에게 자원을 되돌려줌
		} 
        catch (InputMismatchException e) {	
        	// 입력받은 변수의 타입과 선언한 변수의 타입이 맞지 않을 경우 발생하는 exception
			System.out.println("숫자가 아닙니다. 프로그램을 종료합니다.");
		}
	}
}
