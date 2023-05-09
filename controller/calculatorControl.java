package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculatorControl {
	public void calculatorControl1() throws IOException {

		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		String numberA = num.readLine();

		if(isInteger(num)) {
			int nA = Integer.parseInt(num);
		}
		String numberB = num.readLine();
		if(isInteger(num)) {
			int nB = Integer.parseInt(num);
		}

	}

	private boolean isInteger(BufferedReader num) {
		try {
			int n = Integer.parseInt(num);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.");
			return false
		}
		return true;
	}
	
}
