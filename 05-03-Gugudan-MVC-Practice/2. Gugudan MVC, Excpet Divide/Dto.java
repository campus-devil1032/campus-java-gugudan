package test;
import java.util.Scanner;

public class Dto {
	
	private Scanner input = new Scanner(System.in);
	private int dan;
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
		
		Except.GuguException(input, this.dan);

		for (int i = 1; i < 10; i++)
			System.out.println(this.dan + "x" + i + "=" + dan * i);

		input.close();
		
		return "[정상출력] " + Print;
	}

	public void setPrint(String Print) {
		this.Print = Print;
	}
	
	
	
	
}
