package test1;

import java.util.Scanner;

public class Controller {
	Gugu gugu = new Gugu();
	int c = 0;
	Scanner scan = new Scanner(System.in);
	
	public void numberInput() {
		c = scan.nextInt(); //���⼭ ���ϰ��� �ϴ� �������� ���� �Է����ش�
	}
	public int numberOutput() {
		return c; //���� �Էµ� ���� ���� ��!
	}
	
}
