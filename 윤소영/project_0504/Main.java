package project_0504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		
		int menuNum = 1;
		while(true) {
			System.out.print("사용할 기능의 번호를 입력하세요.(0 입력시 종료)\n1. 계산기\n2. 구구단 출력\n> ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			menuNum = Integer.parseInt(br.readLine());
	
			if(menuNum == 1) { // 계산기
				System.out.print("계산식을 입력해주세요. (ex. 1 + 2)\n> ");
				String exp = br.readLine();
				
				Calculator calc = new Calculator();
				calc.calculate(exp);
				
			}else if(menuNum == 2) { // 구구단 출력
				int num = 0;
				System.out.print("출력할 단 수를 입력하세요 > ");
				num = Integer.parseInt(br.readLine());
				
				TimesTable tt = new TimesTable(num);
				tt.printTimesTable();
				
			}else if(menuNum == 0){ // 0 입력시 while문 빠져나가며 종료
				break;
			}else { // 0, 1, 2 외의 번호 입력시 번호 재입력 요청
				System.out.println("유효한 번호를 입력해주세요.\n");
			}
		}
	}
}