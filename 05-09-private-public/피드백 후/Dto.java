package program;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dto {
	
	private static Scanner input = new Scanner(System.in);
	private int gugu_dan;
	private String print;
	private int cal_result;
	private int cal_n1, cal_n2;
	
	public Dto(int gugu_dan) {
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

	public int getGugu_dan() {
		return gugu_dan;
	}

	public void setGugu_dan(int gugu_dan) {
		this.gugu_dan = gugu_dan;
	}
	
	public int getCal_result() {
		return cal_result;
	}

	public void setCal_result(int cal_result) {
		this.cal_result = cal_result;
	}
	
		
	public String getPrint() {
		while (true) {
			System.out.println("[�������] " + print);
			try {
				SelectSwitch();
					
			} catch (InputMismatchException e) {
				System.out.println("�߸��� ���ڸ� �Է��߽��ϴ�!");
				input = new Scanner(System.in);
			}
			

		}

	}

	public void setPrint(String print) {
		this.print = print;
	}
	
	public void SelectSwitch(){
		Menu();
		
		int n = 0;
		
		while(true) {
			n = input.nextInt();
			
			switch(n) {
		
				case 1:
					System.out.println("=====<����>=====");
					System.out.println("�ؼ��� 2���� �Է��ؾ��մϴ�.");
					CalView();
					Menu();
					break;
				case 2:
					System.out.println("=====<������>======");
					System.out.println("1 ~ 999������ ���� �Է����ּ���");
					Gugu();
					Menu();
					break;
				case 3:
					input.close();
					System.out.println("���α׷��� ���������� ����!");
					System.exit(0);
				default:
					System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
					SelectSwitch();
		
			}
		}
	
	}
	
	


	public void Gugu() {
		Except.Gugu_Ex(input, this.gugu_dan);

	
	}
	
	
	public static void Menu() {
		System.out.println("======<�� ��>======");
		System.out.println("1���� ������ ���� �Դϴ�.");
		System.out.println("2���� ������ �������Դϴ�.");
		System.out.println("3���� ������ ���α׷��� ���� �մϴ�.");
		System.out.println("================");
	}
	
	
	public void CalView() {

		while (true) {
			try {
				System.out.println("ù ���� ���ڸ� �Է����ּ���:");
				this.cal_n1 = input.nextInt();
				System.out.println("�� ��° ���ڸ� �Է����ּ���:");
				this.cal_n2 = input.nextInt();

				Cal_Operator(this.cal_n1, this.cal_n2);

				System.out.println("�����: " + this.cal_result);
				break;
			} catch (InputMismatchException e) {
				System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
				System.out.println("������ �Է����ּ���.");
				input = new Scanner(System.in);
	
			}

		}
		
	}

	public void Cal_Operator(int cal_n1, int cal_n2) {
		String oper = "";
		System.out.println("�����ڸ� �������ּ���:");
		System.out.println("���ϱ�: +, ����: -, ���ϱ�: *, ������: /");	
		oper = input.next();
		
		switch (oper) {
		case "+":
			this.cal_result = cal_n1 + cal_n2;
			break;
		case "-":
			this.cal_result = cal_n1 - cal_n2;
			break;
		case "*":
			this.cal_result = cal_n1 * cal_n2;
			break;
		case "/":
			this.cal_result = cal_n1 / cal_n2;
			break;
		default:
			System.out.println("�߸��� �����ڰ� �ԷµǾ����ϴ�! ");
			System.out.println("�����ڸ� �������ּ���:");
			System.out.println("���ϱ�: +, ����: -, ���ϱ�: *, ������: /");
			Cal_Operator(cal_n1, cal_n2);
		}
		
	}
	
}
