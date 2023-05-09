

import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;

public class gugudancalculator {

	public static void main(String[] args) throws Exception {
		while(true) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������-�������α׷��Դϴ� ��������1�� �����2�� ����� q�Դϴ�.");
		String input = br.readLine();
		if(input.equals("q")) {
			break;
		}
		if(input.equals("1")) {
			System.out.println("�������� �����ϼ̽��ϴ�.������ ���񽺷� �̵��մϴ�.");
			selectGugudan();
			break;
		}
		if(input.equals("2")) {
			System.out.println("���⸦ �����ϼ̽��ϴ� ����� ���� �����غ����Դϴ�");
		}
		else {
			System.out.println("�Է��� �߸��ϼ̽��ϴ�.�ٽ��Է����ֻ���");
		}
		}
	}

	private static void selectGugudan() throws Exception {
		System.out.println("�����ܼ����Դϴ�.����Ͻ� �� ���� �Է����ּ���");
		BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
	    String num = number.readLine();
	    if(isInteger(num)) {
			int danvalue = Integer.parseInt(num);
			viewgugudan (danvalue);
	    }
	    
	}

	private static void viewgugudan(int danvalue) {
		System.out.println(danvalue+"���� ����մϴ�");
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
			System.out.println("���ڸ� �Է����ּ���");
			return false;
		} catch (DanvalueException e) {
			return false;
		}
		return true;
	}

}
