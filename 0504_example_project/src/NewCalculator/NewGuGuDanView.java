package NewCalculator;

import java.util.Scanner;

public class NewGuGuDanView {

	private Scanner sc;


	public NewGuGuDanView() {
		sc = new Scanner(System.in);
		System.out.println("구구단을 외자, 구구단을 외자!");
		System.out.println("몇 단?");

	}

	public int getInput() {
		return sc.nextInt();
	}

	public void result(int[] table) {
		for (int i = 0; i < table.length; i++) {
			System.out.println((i + 1) + " * " + (i+1) + " = " + table[i]);
		}
	}

	public void errorMessage () {
		System.out.println("바보!");
	}


}