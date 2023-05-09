
package test1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class myclass_second {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 9; i++) {
			System.out.println("-----" + i + "´Ü-----");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println(x + " x " + y + " = " + (x * y));

	}
	public static boolean isInteger (String s) {
		
	}

}
