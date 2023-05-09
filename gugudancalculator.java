

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;

public class gugudancalculator {

	public static void main(String[] args) throws Exception {
		while(true) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("구구단-계산기프로그램입니다 구구단은1번 계산기는2번 종료는 q입니다.");
		String input = br.readLine();
		if(input.equals("q")) {
			break;
		}
		if(input.equals("1")) {
			System.out.println("구구단을 선택하셨습니다.구구단 서비스로 이동합니다.");
			selectGugudan();
			break;
		}
		if(input.equals("2")) {
			System.out.println("계산기를 선택하셨습니다 계산기는 아직 서비스준비중입니다");
		}
		else {
			System.out.println("입력을 잘못하셨습니다.다시입력해주새요");
		}
		}
	}

	private static void selectGugudan() throws Exception {
		System.out.println("구구단서비스입니다.출력하실 단 수를 입력해주세요");
		BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
	    String num = number.readLine();
	    if(isInteger(num)) {
			int danvalue = Integer.parseInt(num);
			viewgugudan (danvalue);
	    }
	    
	}

	private static void viewgugudan(int danvalue) {
		System.out.println(danvalue+"단을 출력합니다");
		for(int i = 1; i<=9; i++) {
			System.out.println(danvalue+" X "+i+" = "+danvalue*i);
		}
		
	}

	private static boolean isInteger(String num) {
		try {
			int n = Integer.parseInt(num);
			if (n>999||n<1) 
				throw new DanvalueException();
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요");
			return false;
		} catch (DanvalueException e) {
			return false;
		}
		return true;
	}

}
