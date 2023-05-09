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
			System.out.println("[정상출력] " + print);
			try {
				SelectSwitch();
					
			} catch (InputMismatchException e) {
				System.out.println("잘못된 문자를 입력했습니다!");
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
		Except.Gugu_Ex(input, this.gugu_dan);

	
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
				this.cal_n1 = input.nextInt();
				System.out.println("두 번째 숫자를 입력해주세요:");
				this.cal_n2 = input.nextInt();

				Cal_Operator(this.cal_n1, this.cal_n2);

				System.out.println("계산결과: " + this.cal_result);
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 문자가 입력되었습니다.");
				System.out.println("정수를 입력해주세요.");
				input = new Scanner(System.in);
	
			}

		}
		
	}

	public void Cal_Operator(int cal_n1, int cal_n2) {
		String oper = "";
		System.out.println("연사자를 선택해주세요:");
		System.out.println("더하기: +, 뺴기: -, 곱하기: *, 나누기: /");	
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
			System.out.println("잘못된 연사자가 입력되었습니다! ");
			System.out.println("연사자를 선택해주세요:");
			System.out.println("더하기: +, 뺴기: -, 곱하기: *, 나누기: /");
			Cal_Operator(cal_n1, cal_n2);
		}
		
	}
	
}
