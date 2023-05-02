package exam1;

import java.util.Scanner;

public class exam2 {
	public static void main(String[]args) {
	
	System.out.println("아래에 단을 기입하시오");
	Scanner sc = new Scanner(System.in);
	System.out.println(" ");
	int dan = sc.nextInt();
	
	for (int i = 1; i < 10; i++) {
		System.out.println(dan + " * " + i + " = " + (dan*i));
	}
	
}}