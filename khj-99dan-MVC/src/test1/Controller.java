package test1;

import java.util.Scanner;

public class Controller {
	Gugu gugu = new Gugu();
	int c = 0;
	Scanner scan = new Scanner(System.in);
	
	public int numberInput() {
		c = scan.nextInt();
		return c;
	}
	
}
