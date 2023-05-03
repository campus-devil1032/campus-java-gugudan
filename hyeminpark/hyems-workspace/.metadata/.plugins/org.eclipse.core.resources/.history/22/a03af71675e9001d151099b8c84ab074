package except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputWithInt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입력하신 값의 타입을 알려드려요 : ");
		String input = br.readLine();
		
		if (isInterger(input)) {
			int num = Integer.parseInt(input);
			System.out.println("입력한 값은 정수형입니다. "+ num);
		} else if (isDouble(input)) {
			double num = Double.parseDouble(input);
			System.out.println("입력한 값은 실수형입니다. " + num);
		} else {
			System.out.println("입력한 값은 문자형입니다. " + input);
		}
	}
	
	public static boolean isInterger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean isDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
