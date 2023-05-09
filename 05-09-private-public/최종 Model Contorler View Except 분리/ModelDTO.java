package program2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ModelDTO {
	private static Scanner input = new Scanner(System.in);
	private static int gugu_dan;
	private String print;
	private static int cal_result;
	private int cal_n1, cal_n2;
	
	public ModelDTO(int gugu_dan) {
		this.gugu_dan = gugu_dan;
	}
	
	public int getCal_n1() {
		return cal_n1;
	}

	public void setCal_n1(int cal_n1) {
		this.cal_n1 = cal_n1;
	}

	public int getCal_n2() {
		return cal_n2;
	}

	public void setCal_n2(int cal_n2) {
		this.cal_n2 = cal_n2;
	}

	public static int getGugu_dan() {
		return gugu_dan;
	}

	public void setGugu_dan(int gugu_dan) {
		this.gugu_dan = gugu_dan;
	}
	
	static int getCal_result() {
		return cal_result;
	}

	public void setCal_result(int cal_result) {
		this.cal_result = cal_result;
	}
	
		
	public String getPrint() {
		
		System.out.println("[�������] " + print);
		
		while (true) {
			
			try {
				View.SelectSwitch(input,this.cal_n1, this.cal_n2);
					
			} catch (InputMismatchException e) {
				System.out.println("�߸��� ���ڸ� �Է��߽��ϴ�!");
				input = new Scanner(System.in);
			}
			

		}

	}

	public void setPrint(String print) {
		this.print = print;
	}
	
	
	public static void cal_Operator(int cal_n1, int cal_n2) {
		String oper = "";
		System.out.println("�����ڸ� �������ּ���:");
		System.out.println("���ϱ�: +, ����: -, ���ϱ�: *, ������: /");	
		oper = input.next();
		
		switch (oper) {
		case "+":
			cal_result = cal_n1 + cal_n2;
			break;
		case "-":
			cal_result = cal_n1 - cal_n2;
			break;
		case "*":
			cal_result = cal_n1 * cal_n2;
			break;
		case "/":
			cal_result = cal_n1 / cal_n2;
			break;
		default:
			System.out.println("�߸��� �����ڰ� �ԷµǾ����ϴ�! ");
			System.out.println("�����ڸ� �������ּ���:");
			System.out.println("���ϱ�: +, ����: -, ���ϱ�: *, ������: /");
			cal_Operator(cal_n1, cal_n2);
		}
		
	}
}

