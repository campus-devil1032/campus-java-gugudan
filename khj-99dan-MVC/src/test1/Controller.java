package test1;

import java.util.Scanner;

public class Controller {
	Gugu gugu = new Gugu();
	int c = 0;
	Scanner scan = new Scanner(System.in);
	
	public void numberInput() {
		c = scan.nextInt(); //여기서 구하고자 하는 구구단의 값을 입력해준다
	}
	public int numberOutput() {
		return c; //이제 입력된 값이 쓰일 것!
	}
	
}
