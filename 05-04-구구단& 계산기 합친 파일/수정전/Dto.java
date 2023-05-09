package test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dto {
	
	private Scanner input = new Scanner(System.in);
	private int dan;
	private String Print;
	private int res;
	
	
	
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
	
		
	public String getPrint() { //throws IOException
		SelectSwitch();
		
		
	

		input.close();
		
		return "[�������] " + Print;
	}

	public void setPrint(String Print) {
		this.Print = Print;
	}
	
	public void SelectSwitch(){
		Menu();
		
		int n;
		
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
					Menu();
					break;
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
	
	
	public void Menu() {
		System.out.println("======<�� ��1>======");
		System.out.println("1���� ������ ���� �Դϴ�.");
		System.out.println("2���� ������ �������Դϴ�.");
		System.out.println("3���� ������ �޴������� ���ư��ϴ�.");
		System.out.println("================");
	}
	


	
	
	
	public void CalView() {
		int n1, n2;
		
		try {
			System.out.println("ù ���� ���ڸ� �Է����ּ���:");
			n1 = input.nextInt();
		
		
		}
		catch(InputMismatchException e) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			System.out.println("������ �Է����ּ���.");
			System.out.println("ù ���� ���ڸ� �Է����ּ���:");
			n1 = input.nextInt();
		
		
		}
		
		
		try {
		
		
			System.out.println("�� ��° ���ڸ� �Է����ּ���:");
			n2 = input.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			System.out.println("������ �Է����ּ���.");
			System.out.println("�� ��° ���ڸ� �Է����ּ���:");
			n2 = input.nextInt();
		}
		
		
		
		Cal(n1,n2);
		
		System.out.println("�����: " + this.res);
		
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
