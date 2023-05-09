package Exeption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("구구단 프로그램입니다.");
		while(true) {
			System.out.println("1~999의 원하는 숫자를 입력해주세요.");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			
			if(inputInteger(input)) {				
				int result;
				int num = Integer.parseInt(input);
				if(num>=1 && num<=999) {
					System.out.println(num + "단입니다.");
					for(int i=1;i<10;i++) {
						result = num * i;	
						System.out.println(num + " x " + i + " = " + result);
					}
				}else {
					System.out.println(input + "은 1~999사이의 숫자가 아닙니다.");
				}
			}
			
			else if(inputDouble(input)) {
				double num = Double.parseDouble(input);
				System.out.println(num + "은 실수형입니다.");
			}
			
			else {
				System.out.println("입력한 값은 문자열입니다");
			}			
		}
	}
	
	public static boolean inputInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean inputDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}

}
