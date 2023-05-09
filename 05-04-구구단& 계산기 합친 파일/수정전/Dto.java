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
		
		return "[정상출력] " + Print;
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
					Menu();
					break;
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
	
	
	public void Menu() {
		System.out.println("======<메 뉴1>======");
		System.out.println("1번을 누르면 계산기 입니다.");
		System.out.println("2번을 누르면 구구단입니다.");
		System.out.println("3번을 누르면 메뉴판으로 돌아갑니다.");
		System.out.println("================");
	}
	


	
	
	
	public void CalView() {
		int n1, n2;
		
		try {
			System.out.println("첫 번쨰 숫자를 입력해주세요:");
			n1 = input.nextInt();
		
		
		}
		catch(InputMismatchException e) {
			System.out.println("잘못된 문자가 입력되었습니다.");
			System.out.println("정수를 입력해주세요.");
			System.out.println("첫 번쨰 숫자를 입력해주세요:");
			n1 = input.nextInt();
		
		
		}
		
		
		try {
		
		
			System.out.println("두 번째 숫자를 입력해주세요:");
			n2 = input.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("잘못된 문자가 입력되었습니다.");
			System.out.println("정수를 입력해주세요.");
			System.out.println("두 번째 숫자를 입력해주세요:");
			n2 = input.nextInt();
		}
		
		
		
		Cal(n1,n2);
		
		System.out.println("계산결과: " + this.res);
		
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
