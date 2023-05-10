package project_0504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		int menuNum;
		String exp;
		int num;
		
		while (true) {
			System.out.print("사용할 기능의 번호를 입력하세요.\n1. 계산기\n2. 구구단 출력\n3. 종료\n> ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			menuNum = Integer.parseInt(br.readLine());

			if (menuNum == 1) { // 계산기
				while (true) {
					System.out.print("\n연산식을 입력하세요. (ex. 1 + 2)\n(0 입력 시 계산기 종료)\n> ");
					exp = br.readLine();
					if(exp.equals("0")) {
						System.out.println();
						break;
					}else {
						try{
							StringTokenizer st = new StringTokenizer(exp);
							int op1 = Integer.parseInt(st.nextToken());
							String op = st.nextToken();
							int op2 = Integer.parseInt(st.nextToken());
	
							Calculator calc = new Calculator(op1, op, op2);
							calc.calculate();
						}catch (NoSuchElementException e) { // 연산자나 피연산자 미입력했을 때 발생
							System.out.println("연산식을 정확하게 입력하세요.\n");
						}
					}
				}
			} else if (menuNum == 2) { // 구구단 출력
				while (true) {
					System.out.print("\n출력할 단 수를 입력하세요.\n(0 입력 시 구구단 출력 종료)\n> ");
					num = Integer.parseInt(br.readLine());
					if(num == 0) {
						System.out.println();
						break;
					}else {
						TimesTable tt = new TimesTable(num);
						tt.printTimesTable();
						}
				}

			} else if (menuNum == 3) { // 3 입력 시 전체 종료
				break;
			} else { // 1, 2, 3 외의 번호 입력 시 번호 재입력 요청
				System.out.println("유효한 번호를 입력하세요.\n");
			}
		}
	}	
}

class InputOutOfBoundsException extends Exception {}