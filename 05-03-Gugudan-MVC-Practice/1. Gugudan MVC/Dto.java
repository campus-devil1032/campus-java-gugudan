package test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dto {
	
	private Scanner input = new Scanner(System.in);
	private int dan;
	//private String carModel;
	private String Print;
	
	
	
	public Dto(int dan) {
		this.dan = dan;
		
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
		
	public String getPrint() { //throws IOException
		
		GuguException();

		for (int i = 1; i < 10; i++)
			System.out.println(this.dan + "x" + i + "=" + dan * i);

		input.close();
		
		return "[정상출력] " + Print;
	}

	public void setPrint(String Print) {
		this.Print = Print;
	}
	
	
	
	public void GuguException() {
		while (true) {
			try {
				this.dan = input.nextInt();
				if(this.dan>999 || this.dan<1)
					System.out.println("1 ~ 999까지의 입력만 유효");
				else
					break;
				
			}

			catch (InputMismatchException e) { //Exception e, InputMismatchException e, IOException e
				input = new Scanner(System.in);
				System.out.println("예외발생! 잘못된 입력");
				System.out.println("정수만 입력하세요");
			}

		}
	}
}
