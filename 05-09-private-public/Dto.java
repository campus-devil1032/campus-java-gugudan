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
			System.out.println("[정상출력] " + Print);
			try {
				SelectSwitch();
					
			} catch (InputMismatchException e) {
				System.out.println("잘못된 문자를 입력했습니다!");
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
		Except.GuguException(input, this.Gugu_Dan);

		for (int i = 1; i < 10; i++)
			System.out.println(this.Gugu_Dan + "x" + i + "=" + Gugu_Dan * i);
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
				this.Cal_N1 = input.nextInt();
				System.out.println("두 번째 숫자를 입력해주세요:");
				this.Cal_N2 = input.nextInt();

				Cal(this.Cal_N1, this.Cal_N2);

				System.out.println("계산결과: " + this.Cal_result);
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 문자가 입력되었습니다.");
				System.out.println("정수를 입력해주세요.");
				input = new Scanner(System.in);
	

			}

		}
		
	}
	

	public void Cal(int Cal_N1, int Cal_N2) {
		String oper = "";
		System.out.println("연사자를 선택해주세요:");
		System.out.println("더하기: +, 뺴기: -, 곱하기: *, 나누기: /");	
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
			System.out.println("잘못된 연사자가 입력되었습니다! ");
			System.out.println("연사자를 선택해주세요:");
			System.out.println("더하기: +, 뺴기: -, 곱하기: *, 나누기: /");
			Cal(Cal_N1,Cal_N2);
		}
		
		 
		
		
	}
	
	
}
