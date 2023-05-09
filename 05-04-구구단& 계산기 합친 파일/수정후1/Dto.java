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
			System.out.println("[정상출력] " + Print);
			try {
				SelectSwitch();
					
				//return "[정상출력] " + Print;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 문자를 입력했습니다!");
				input = new Scanner(System.in);
			}
			

		}

		//return "[정상출력] " + Print;
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
					System.out.println("=====<계산기>=====");
					System.out.println("※숫자 2개를 입력해야합니다.");
					CalView();
					Menu();
					break;
				case 2:
					System.out.println("=====<구구단>======");
					System.out.println("1 ~ 999까지의 숫자 입력해주세요");
					Gugu();
					Menu();
					break;
				case 3:
					input.close();
					System.out.println("프로그램을 정상적으로 종료!");
					System.exit(0);
				default:
					System.out.println("잘못된 문자를 입력하셨습니다.");
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
		System.out.println("======<메 뉴>======");
		System.out.println("1번을 누르면 계산기 입니다.");
		System.out.println("2번을 누르면 구구단입니다.");
		System.out.println("3번을 누르면 프로그램을 종료 합니다.");
		System.out.println("================");
	}
	
	
	public void CalView() {

		while (true) {
			try {
				System.out.println("첫 번쨰 숫자를 입력해주세요:");
				this.n1 = input.nextInt();
				System.out.println("두 번째 숫자를 입력해주세요:");
				this.n2 = input.nextInt();

				Cal(this.n1, this.n2);

				System.out.println("계산결과: " + this.res);
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 문자가 입력되었습니다.");
				System.out.println("정수를 입력해주세요.");
				// n1 = input.nextInt();
				input = new Scanner(System.in);
				// CalView();

			}

		}
		
	}
	

	public void Cal(int n1, int n2) {
		String oper = "";
		System.out.println("연사자를 선택해주세요:");
		System.out.println("더하기: +, 뺴기: -, 곱하기: *, 나누기: /");	
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
			System.out.println("잘못된 연사자가 입력되었습니다! ");
			System.out.println("연사자를 선택해주세요:");
			System.out.println("더하기: +, 뺴기: -, 곱하기: *, 나누기: /");
			Cal(n1,n2);
		}
		
		 
		
		
	}
	
	
}
