package test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dto {
	
	private static Scanner input = new Scanner(System.in);
	private int dan;
	private String Print;
	private int res;
	public int n1, n2;
	
	
	
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public Dto(int dan) {
		this.dan = dan;
		
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}
	
		
	public String getPrint() {
		while (true) {
			System.out.println("[�������] " + Print);
			try {
				SelectSwitch();
					
				//return "[�������] " + Print;
			} catch (InputMismatchException e) {
				System.out.println("�߸��� ���ڸ� �Է��߽��ϴ�!");
				input = new Scanner(System.in);
			}
			

		}

		//return "[�������] " + Print;
	}

	public void setPrint(String Print) {
		this.Print = Print;
	}
	
	public void SelectSwitch(){
		Menu();
		
		int n = 0;
		
		while(true) {
			n = input.nextInt();
			
			//Except.CalException(input, n);
			//Except b = new Except();
			//this.n = n;
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
		Except.GuguException(input, this.dan);

		for (int i = 1; i < 10; i++)
			System.out.println(this.dan + "x" + i + "=" + dan * i);
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
				this.n1 = input.nextInt();
				System.out.println("�� ��° ���ڸ� �Է����ּ���:");
				this.n2 = input.nextInt();

				Cal(this.n1, this.n2);

				System.out.println("�����: " + this.res);
				break;
			} catch (InputMismatchException e) {
				System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
				System.out.println("������ �Է����ּ���.");
				// n1 = input.nextInt();
				input = new Scanner(System.in);
				// CalView();

			}

		}
		
	}
	

	public void Cal(int n1, int n2) {
		String oper = "";
		System.out.println("�����ڸ� �������ּ���:");
		System.out.println("���ϱ�: +, ����: -, ���ϱ�: *, ������: /");	
		oper = input.next();
		
		switch (oper) {
		case "+":
			this.res = n1 + n2;
			break;
		case "-":
			this.res = n1 - n2;
			break;
		case "*":
			this.res = n1 * n2;
			break;
		case "/":
			this.res = n1 / n2;
			break;
		default:
			System.out.println("�߸��� �����ڰ� �ԷµǾ����ϴ�! ");
			System.out.println("�����ڸ� �������ּ���:");
			System.out.println("���ϱ�: +, ����: -, ���ϱ�: *, ������: /");
			Cal(n1,n2);
		}
		
		 
		
		
	}
	
	
}
