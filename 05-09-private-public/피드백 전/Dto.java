package program;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dto {
	
	private static Scanner input = new Scanner(System.in);
	private int Gugu_Dan;
	private String Print;
	private int Cal_result;
	private int Cal_N1, Cal_N2;
	
	public int getCal_N1() {
		return Cal_N1;
	}

	public void setCal_N1(int Cal_N1) {
		this.Cal_N1 = Cal_N1;
	}

	public int getCal_N2() {
		return Cal_N2;
	}

	public void setCal_N2(int Cal_N2) {
		this.Cal_N2 = Cal_N2;
	}

	public Dto(int Gugu_Dan) {
		this.Gugu_Dan = Gugu_Dan;
		
	}

	public int getGugu_Dan() {
		return Gugu_Dan;
	}

	public void setGugu_Dan(int Gugu_Dan) {
		this.Gugu_Dan = Gugu_Dan;
	}
	
	public int getCal_result() {
		return Cal_result;
	}

	public void setCal_result(int Cal_result) {
		this.Cal_result = Cal_result;
	}
	
		
	public String getPrint() {
		while (true) {
			System.out.println("[�������] " + Print);
			try {
				SelectSwitch();
					
			} catch (InputMismatchException e) {
				System.out.println("�߸��� ���ڸ� �Է��߽��ϴ�!");
				input = new Scanner(System.in);
			}
			

		}

	}

	public void setPrint(String Print) {
		this.Print = Print;
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
		Except.GuguException(input, this.Gugu_Dan);

	
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
				this.Cal_N1 = input.nextInt();
				System.out.println("�� ��° ���ڸ� �Է����ּ���:");
				this.Cal_N2 = input.nextInt();

				Cal(this.Cal_N1, this.Cal_N2);

				System.out.println("�����: " + this.Cal_result);
				break;
			} catch (InputMismatchException e) {
				System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
				System.out.println("������ �Է����ּ���.");
				input = new Scanner(System.in);
	

			}

		}
		
	}
	

	public void Cal(int Cal_N1, int Cal_N2) {
		String oper = "";
		System.out.println("�����ڸ� �������ּ���:");
		System.out.println("���ϱ�: +, ����: -, ���ϱ�: *, ������: /");	
		oper = input.next();
		
		switch (oper) {
		case "+":
			this.Cal_result = Cal_N1 + Cal_N2;
			break;
		case "-":
			this.Cal_result = Cal_N1 - Cal_N2;
			break;
		case "*":
			this.Cal_result = Cal_N1 * Cal_N2;
			break;
		case "/":
			this.Cal_result = Cal_N1 / Cal_N2;
			break;
		default:
			System.out.println("�߸��� �����ڰ� �ԷµǾ����ϴ�! ");
			System.out.println("�����ڸ� �������ּ���:");
			System.out.println("���ϱ�: +, ����: -, ���ϱ�: *, ������: /");
			Cal(Cal_N1,Cal_N2);
		}
		
		 
		
		
	}
	
	
}
