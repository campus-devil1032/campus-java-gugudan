package program2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {

	
	public static void SelectSwitch(Scanner input,int cal_n1, int cal_n2){
		Menu();
		
		int n = 0;
		
		while(true) {
			n = input.nextInt();
			
			switch(n) {
		
				case 1:
					System.out.println("=====<계산기>=====");
					System.out.println("※숫자 2개를 입력해야합니다.");
					CalView(input, cal_n1, cal_n2);
					Menu();
					break;
				case 2:
					System.out.println("=====<구구단>======");
					System.out.println("1 ~ 999까지의 숫자 입력해주세요");
					Except.gugu_Ex(input, ModelDTO.getGugu_dan());
					Menu();
					break;
				case 3:
					input.close();
					System.out.println("프로그램을 정상적으로 종료!");
					System.exit(0);
				default:
					System.out.println("잘못된 문자를 입력하셨습니다.");
					SelectSwitch(input,cal_n1,cal_n2);
		
			}
		}
	
	}
	
	public static void Menu() {
		System.out.println("======<메 뉴>======");
		System.out.println("1번을 누르면 계산기 입니다.");
		System.out.println("2번을 누르면 구구단입니다.");
		System.out.println("3번을 누르면 프로그램을 종료 합니다.");
		System.out.println("================");
	}
	
	public static void CalView(Scanner input, int cal_n1, int cal_n2) {

		while (true) {
			try {
				System.out.println("첫 번쨰 숫자를 입력해주세요:");
				cal_n1 = input.nextInt();
				System.out.println("두 번째 숫자를 입력해주세요:");
				cal_n2 = input.nextInt();

				ModelDTO.cal_Operator(cal_n1, cal_n2);

				System.out.println("계산결과: " + ModelDTO.getCal_result());
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 문자가 입력되었습니다.");
				System.out.println("정수를 입력해주세요.");
				input = new Scanner(System.in);
	
			}

		}
		
	}
	
}
