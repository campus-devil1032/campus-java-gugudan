package May03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputWithInt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�Է��Ͻ� ���� Ÿ���� �˷������ : ");
		String input = br.readLine();
		
		if (isInterger(input)) {
			int num = Integer.parseInt(input);
			System.out.println("�Է��� ���� �������Դϴ�. "+ num);
		} else if (isDouble(input)) {
			double num = Double.parseDouble(input);
			System.out.println("�Է��� ���� �Ǽ����Դϴ�. " + num);
		} else {
			System.out.println("�Է��� ���� �������Դϴ�. " + input);
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
